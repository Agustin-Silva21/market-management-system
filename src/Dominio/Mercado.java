package Dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.beans.*;
import java.io.Serializable;

public class Mercado implements Serializable{
    private static final long serialVersionUID = 1L;
    private ArrayList<Mayorista> listaMayoristas;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Dueño> listaDueños;
    private ArrayList<Movimiento> listaMovimientos;
    //private PropertyChangeSupport manejador;

    public Mercado() {
        //this.manejador = new PropertyChangeSupport(this);
        this.listaMayoristas = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaPuestos = new ArrayList<>();
        this.listaDueños = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
                
    }

    public ArrayList<Mayorista> getListaMayoristas() {
        return listaMayoristas;
    }

    public void agregarListaMayoristas(Mayorista unMayorista) {
        
        this.listaMayoristas.add(unMayorista);
    
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarListaProductos(Producto unProducto) {
        
        this.listaProductos.add(unProducto);
        
    }

    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public void agregarListaPuestos(Puesto unPuesto) {
        
        this.listaPuestos.add(unPuesto);
        
    }

    public ArrayList<Dueño> getListaDueños() {
        return listaDueños;
    }

    public void agregarListaDueños(Dueño unDueño) {
        
        this.listaDueños.add(unDueño);
        
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void agregarListaMovimientos(Movimiento unMovimiento) {
        
        this.listaMovimientos.add(unMovimiento);
        
    }
    
    /*public boolean registrarProducto(Producto unProducto){
        boolean existe = false;
        if (!getListaProductos().contains(unProducto)) {
            agregarListaProductos(unProducto);
            existe = true;
        }
        return existe;
    }*/
    
    public boolean registrarProducto(String nombre, String descripcion, Producto.Tipo unTipo, Producto.FormaVenta unaVenta){
        boolean existe = false;
        Producto p = new Producto(nombre,descripcion,unTipo,unaVenta);
        if (!getListaProductos().contains(p)) {
            agregarListaProductos(p);
            existe = true;
            System.out.println("agregado?");
        }
        return existe;
    }
    
    public boolean registrarDueño(String nombre, int edad, int añosDeExp){
        Dueño dueñoCreado = new Dueño(nombre,edad,añosDeExp);
        boolean existe = false;
        if (!getListaDueños().contains(dueñoCreado)) {
            agregarListaDueños(dueñoCreado);
            existe = true;
        }
        return existe;
    }
    
    public boolean registrarPuesto(Puesto unPuesto){
        boolean existe = false;
        if (!getListaPuestos().contains(unPuesto)) {
            agregarListaPuestos(unPuesto);
            existe = true;
        }
        return existe;
    }
    
    public boolean registrarMayorista(Mayorista unMayorista){
        boolean existe = false;
        if (!getListaMayoristas().contains(unMayorista)) {
            agregarListaMayoristas(unMayorista);
            existe = true;
        }
        return existe;
    }
    
    public void comprarProducto (HashMap<Producto, float[]> listaProductos,Puesto unPuesto,Mayorista unMayorista){
        Iterator<Producto> it = listaProductos.keySet().iterator();
        while (it.hasNext()) {
            Producto unProducto = it.next();
            float cantComprada = listaProductos.get(unProducto)[0];
            float precioUnitario = listaProductos.get(unProducto)[1];
            // 0 es cantidad, 1 es precio
            if (unPuesto.getOferta().containsKey(unProducto)) {
                unPuesto.sumarProducto(cantComprada, unProducto);
            }else{
                unPuesto.agregarProducto(unProducto, cantComprada);                
            }
            Movimiento unMovimiento = new Compra(unPuesto,unMayorista,unProducto,precioUnitario,cantComprada);
            agregarListaMovimientos (unMovimiento);
        }
    }
    
    public void venderProducto(HashMap<Producto, float[]> listaProductos, Puesto unPuesto) {
        Iterator<Producto> it = listaProductos.keySet().iterator();
        boolean hayStock = true;
        while (it.hasNext() && hayStock) {
            Producto unProducto = it.next();
            float cantAVender = listaProductos.get(unProducto)[0];
            if (cantAVender > unPuesto.getOferta().get(unProducto)) {
                hayStock = false;
            }
        }
        it = listaProductos.keySet().iterator();
        if (hayStock) {
            while (it.hasNext()) {
                Producto unProducto = it.next();
                float cantVendida = listaProductos.get(unProducto)[0];
                float precioUnitario = listaProductos.get(unProducto)[1];
                unPuesto.restarProducto(cantVendida, unProducto);
                Movimiento unMovimiento = new Movimiento(unPuesto,unProducto,precioUnitario,cantVendida);
                agregarListaMovimientos (unMovimiento);
            }
            unPuesto.limpiarProducto();
        }
    }
    
    public HashMap<String, Float> consultaProducto(Producto unProducto) {
        HashMap<String, Float> DatosADevolver = new HashMap<>();
        float totalVendido = 0;
        float totalComprado = 0;
        float cantVendida = 0;
        float cantComprada = 0;
        float precioMinimoVendido = 0;
        float precioMaximoVendido = 0;
        Iterator<Movimiento> it = listaMovimientos.iterator();
        while (it.hasNext()) {
            Movimiento unMovimiento = it.next();
            if (unMovimiento.getProducto().equals(unProducto)) {
                if (unMovimiento.getClass().getName().equalsIgnoreCase("Compra")) {
                    totalComprado += unMovimiento.getPrecio();
                    cantComprada += unMovimiento.getCantidad();
                } else {
                    totalVendido += unMovimiento.getPrecio();
                    cantVendida += unMovimiento.getCantidad();
                    if (precioMinimoVendido > unMovimiento.getPrecio()) {
                        precioMinimoVendido = unMovimiento.getPrecio();
                    }
                    if (precioMaximoVendido < unMovimiento.getPrecio()) {
                        precioMaximoVendido = unMovimiento.getPrecio();
                    }                    
                }
            }
        }
        DatosADevolver.put("totalVendido", totalVendido);
        DatosADevolver.put("totalComprado", totalComprado);
        DatosADevolver.put("cantVendida", cantVendida);
        DatosADevolver.put("cantComprada", cantComprada);
        DatosADevolver.put("precioMinimoVendido", precioMinimoVendido);
        DatosADevolver.put("precioMaximoVendido", precioMaximoVendido);
        return DatosADevolver;
    }
    
    public String[] consultaPrecioPuestos(float unPrecio){
        ArrayList<String> listaPuestosAuxiliar = new ArrayList<>();
        for (int i = 0; i < this.getListaMovimientos().size(); i++) {
            Movimiento unMovimiento = this.getListaMovimientos().get(i);
            if (unMovimiento.getPrecio() == unPrecio) {                
                listaPuestosAuxiliar.add(unMovimiento.getPuesto().getId());
            }
        }
        return listaPuestosAuxiliar.toArray(new String[listaPuestosAuxiliar.size()]);
    }
    
    public String[] getListaTipoProducto() {
        Producto.Tipo[] enumValues = Producto.Tipo.values();
        String[] arrayTipoProducto = new String[enumValues.length];

        for (int i = 0; i < enumValues.length; i++) {
            arrayTipoProducto[i] = enumValues[i].toString();
        }
        return arrayTipoProducto;
    }
    
    public String[] getListaFormaVentaProducto() {
        Producto.FormaVenta[] enumValues = Producto.FormaVenta.values();
        String[] arrayTipoProducto = new String[enumValues.length];

        for (int i = 0; i < enumValues.length; i++) {
            arrayTipoProducto[i] = enumValues[i].toString();
        }
        return arrayTipoProducto;
    }
    
    
    
    
}
