// Gabriel Machado 318697, Agustin Silva 310087
package Dominio;

// Cuando creas un movimiento creas una venta, si creas Compra, ahi si te queda Compra

import java.io.Serializable;

public class Movimiento implements Serializable{
    private static int id = 0;
    private Puesto puesto;
    private Producto producto;
    private float precio;
    private float cantidad;

    public Movimiento(Puesto unPuesto, Producto unProducto, float precio, float cantidad) {
        id = getId();
        this.puesto = unPuesto;
        this.producto = unProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Movimiento.id = id;
    }
    
    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto unPuesto) {
        this.puesto = unPuesto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto unProducto) {
        this.producto = unProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return this.getId() + ", " + this.getProducto() + ", " + this.getCantidad() + ", " + this.getPrecio();
    }
    
}
