// Gabriel Machado 318697, Agustin Silva 310087
package Dominio;

import Interfaz.consultaPuestos;
import Main.Obligatorio2;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mercado implements Serializable{
    private static final long serialVersionUID = 1L;
    private ArrayList<Mayorista> listaMayoristas;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Dueño> listaDueños;
    private ArrayList<Movimiento> listaMovimientos;
    private transient PropertyChangeSupport manejador;

    public Mercado() {
        this.manejador = new PropertyChangeSupport(this);
        this.listaMayoristas = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaPuestos = new ArrayList<>();
        this.listaDueños = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
                
    }

    public PropertyChangeSupport getManejador() {
        return manejador;
    }

    public void setManejador() {
        this.manejador = new PropertyChangeSupport(this);
    }
    
    
    
    public ArrayList<Mayorista> getListaMayoristas() {
        return listaMayoristas;
    }

    public void agregarListaMayoristas(Mayorista unMayorista) {
        this.listaMayoristas.add(unMayorista);
        ordenarMayoristas();
        manejador.firePropertyChange("listaMayoristas", null, this.listaMayoristas);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarListaProductos(Producto unProducto) {
        this.listaProductos.add(unProducto);
        manejador.firePropertyChange("listaProductos", null, this.listaProductos);
    }

    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public void agregarListaPuestos(Puesto unPuesto) {
        this.listaPuestos.add(unPuesto);
        manejador.firePropertyChange("listaPuestos", null, this.listaPuestos);
    }

    public ArrayList<Dueño> getListaDueños() {
        return listaDueños;
    }

    public void agregarListaDueños(Dueño unDueño) {
        this.listaDueños.add(unDueño);
        manejador.firePropertyChange("listaDueños", null, this.listaDueños);
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void agregarListaMovimientos(Movimiento unMovimiento) {
        this.listaMovimientos.add(unMovimiento);
        manejador.firePropertyChange("listaMovimientos", null, this.listaMovimientos);
    }
    
    
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
    
    public boolean registrarPuesto(String id, Dueño dueño, String ubicacion, int cantEmpleados){
        Puesto puestoCreado = new Puesto(id,dueño,ubicacion,cantEmpleados);
        boolean existe = false;
        if (!getListaPuestos().contains(puestoCreado)) {
            agregarListaPuestos(puestoCreado);
            existe = true;
        }
        return existe;
    }
    
    public boolean registrarMayorista(String rut, String nombre, String direccion, ArrayList<Producto> Producto){
        Mayorista mayoristaCreado = new Mayorista(rut,nombre,direccion,Producto);
        boolean existe = false;
        if (!getListaMayoristas().contains(mayoristaCreado)) {
            agregarListaMayoristas(mayoristaCreado);
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
    
    public Dueño getDueñoPorIndice(int indice) {
        if (indice >= 0 && indice < listaDueños.size()) {
            return listaDueños.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + indice);
        }
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
    
    public ArrayList<Producto> getProductoPorNombre(List<String> listaProductosString){
        ArrayList<Producto> productosHallados = new ArrayList<>();
        
        for (int i = 0; i < listaProductosString.size(); i++) {
            boolean encontre = false;
            int j = 0;
            while(!encontre){
                Producto productoEncontrado = this.getListaProductos().get(j);
                if (productoEncontrado.getNombre().equals(listaProductosString.get(i))) {
                    encontre = true;
                    productosHallados.add(productoEncontrado);
                }
            }
        }
        return productosHallados;
    }
    
    public void ordenarMayoristas() {
        Collections.sort(listaMayoristas, new Comparator<Mayorista>() {
            public int compare(Mayorista m1, Mayorista m2) {
                return m1.getNombre().compareToIgnoreCase(m2.getNombre());
            }
        });
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        
        manejador.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        manejador.removePropertyChangeListener(listener);
    }
    
    public boolean seEjecutaDesdeJar() {
        String jarPath = Obligatorio2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        return jarPath.endsWith(".jar");
    }
}