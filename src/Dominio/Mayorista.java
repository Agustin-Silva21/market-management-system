// Gabriel Machado 318697, Agustin Silva 310087
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;


public class Mayorista implements Serializable{
    private String rut;
    private String nombre;
    private String direccion;
    private ArrayList<Producto> Producto;

    public Mayorista(String rut, String nombre, String direccion, ArrayList<Producto> Producto) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.Producto = Producto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getProducto() {
        return Producto;
    }

    public void setProducto(ArrayList<Producto> Producto) {
        this.Producto = Producto;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + this.getRut();
    }
    
}
