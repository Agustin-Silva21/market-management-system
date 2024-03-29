// Gabriel Machado 318697, Agustin Silva 310087
package Dominio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;


public class Puesto implements Serializable{
    private String id;
    private Dueño dueño;
    private String ubicacion;
    private int cantEmpleados;
    private final HashMap<Producto,Float> oferta;

    public Puesto(String id, Dueño dueño, String ubicacion, int cantEmpleados) {
        this.id = id;
        this.dueño = dueño;
        this.ubicacion = ubicacion;
        this.cantEmpleados = cantEmpleados;
        this.oferta = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public HashMap<Producto, Float> getOferta() {
        return oferta;
    }

    public void agregarProducto(Producto unProducto,float cantidad) {
        this.oferta.put(unProducto, cantidad);
    }
    
    
    public void limpiarProducto(){
        Iterator<Producto> it = this.getOferta().keySet().iterator();
        while (it.hasNext()) {
            Producto unProducto = it.next();
            if (this.getOferta().get(unProducto) == 0) {
                this.getOferta().remove(unProducto);
            }
        }
    }
    
    public boolean restarProducto(float cantidad,Producto unProducto){
        boolean sePuede = false;
        if (getOferta().get(unProducto) >= cantidad){
            getOferta().replace(unProducto, getOferta().get(unProducto) - cantidad);
            sePuede = true;
        }
        return sePuede;
    }
    
    public void sumarProducto(float cantidad,Producto unProducto){
        getOferta().replace(unProducto, getOferta().get(unProducto) + cantidad);            
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Puesto unPuesto = (Puesto) obj;
        return id.equals(unPuesto.id);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    public String toString(){
        return this.id;
    }
    
    
}
