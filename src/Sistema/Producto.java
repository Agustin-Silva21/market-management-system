/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.awt.image.BufferedImage;

/**
 *
 * @author agustin973
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private Tipo unTipo;
    private FormaVenta unaVenta;
    private BufferedImage imagen;
    // https://stackoverflow.com/questions/34072052/is-it-possible-to-add-an-image-png-as-an-attribute-of-a-java-class
    public enum Tipo {Fruta,Verdura}
    public enum FormaVenta {Unidad,Kilogramo}

    public Producto(String nombre, String descripcion, Tipo unTipo, FormaVenta unaVenta, BufferedImage imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unTipo = unTipo;
        this.unaVenta = unaVenta;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getUnTipo() {
        return unTipo;
    }

    public void setUnTipo(Tipo unTipo) {
        this.unTipo = unTipo;
    }

    public FormaVenta getUnaVenta() {
        return unaVenta;
    }

    public void setUnaVenta(FormaVenta unaVenta) {
        this.unaVenta = unaVenta;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = ImageIO.read(new File(name + ".png"));
    }
    
    
    public Producto (String name) {
        this.name = name;
        
    }
}
