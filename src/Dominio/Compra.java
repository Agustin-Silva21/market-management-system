/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author agustin973
 */
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
