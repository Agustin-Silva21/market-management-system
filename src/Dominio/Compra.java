// Gabriel Machado 318697, Agustin Silva 310087
package Dominio;


public class Compra extends Movimiento{
    private Mayorista mayorista;
    
    public Compra(Puesto unPuesto,Mayorista unMayorista, Producto unProducto, float precio, float cantidad) {
        super(unPuesto, unProducto, precio, cantidad);
        this.mayorista = unMayorista;
    }

    public Mayorista getMayorista() {
        return mayorista;
    }

    public void setMayorista(Mayorista mayorista) {
        this.mayorista = mayorista;
    }
    
    
}
