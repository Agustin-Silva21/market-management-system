package Dominio;

// Cuando creas un movimiento creas una venta, si creas Compra, ahi si te queda Compra
public class Movimiento {
    private static int id = 0;
    private Puesto unPuesto;
    // private Mayorista unMayorista;
    // Probamos con clase abstracta y sino lo dejamos aca y lo ponemos null
    private Producto unProducto;
    private float precio;
    private float cantidad;

    public Movimiento(Puesto unPuesto, Producto unProducto, float precio, float cantidad) {
        this.id = getId();
        this.unPuesto = unPuesto;
        this.unProducto = unProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // posible solucion: https://www.javatpoint.com/how-to-find-number-of-objects-created-in-java
    
    public Puesto getUnPuesto() {
        return unPuesto;
    }

    public void setUnPuesto(Puesto unPuesto) {
        this.unPuesto = unPuesto;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
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
    
    
}
