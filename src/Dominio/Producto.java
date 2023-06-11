/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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

    public Producto() throws IOException{
        this.nombre = "----";
        this.descripcion = "----";
        this.unTipo = Tipo.Fruta;
        this.unaVenta = FormaVenta.Kilogramo;
        this.imagen = ImageIO.read(new File("/home/agustin973/NetBeansProjects/Obligatorio2/src/Helpers/No-Image-Placeholder.jpg"));
    }
    
    public Producto(String nombre, String descripcion, Tipo unTipo, FormaVenta unaVenta, String imagenPath) {
        this(nombre,descripcion,unTipo,unaVenta);
        try {
            this.imagen = ImageIO.read(new File(imagenPath));
        } catch (IOException e){
            System.out.println("Error al obtener la imagen!");
        }
    }
    
    public Producto(String nombre, String descripcion, Tipo unTipo, FormaVenta unaVenta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unTipo = unTipo;
        this.unaVenta = unaVenta;
        try {    
            this.imagen = ImageIO.read(new File("/home/agustin973/NetBeansProjects/Obligatorio2/src/Helpers/No-Image-Placeholder.jpg"));          
        } catch (IOException e){
            System.out.println("Error al obtener la imagen!");
        }
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

    public Tipo getTipo() {
        return unTipo;
    }

    public void setTipo(Tipo unTipo) {
        this.unTipo = unTipo;
    }

    public FormaVenta getFormaVenta() {
        return unaVenta;
    }

    public void setFormaVenta(FormaVenta unaVenta) {
        this.unaVenta = unaVenta;
    }

    public Icon getImagenAsIcon() {
        return new ImageIcon(this.imagen);
    }

    @Override
    public boolean equals(Object obj) {
    boolean retVal = false;

    if (obj instanceof Producto) {
        Producto ptr = (Producto) obj;
        retVal = (ptr.getNombre() == null ? this.getNombre() == null : ptr.getNombre().equals(this.getNombre()));
    }

    return retVal;
}
    // https://stackoverflow.com/questions/8322129/arraylists-custom-contains-method
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.getNombre() != null ? this.getNombre().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
