/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;

/**
 *
 * @author agustin973
 */
public class Producto implements Serializable, Comparable<Producto>{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String descripcion;
    private Tipo tipo;
    private FormaVenta venta;
    private BufferedImage imagen;
    private String pathImagen;

    
    // https://stackoverflow.com/questions/34072052/is-it-possible-to-add-an-image-png-as-an-attribute-of-a-java-class
    public enum Tipo {Fruta,Verdura}
    public enum FormaVenta {Unidad,Kilogramo}

    // constructor por defecto tendria que tener?
    public Producto() throws IOException{
        this.nombre = "----";
        this.descripcion = "----";
        this.tipo = Tipo.Fruta;
        this.venta = FormaVenta.Kilogramo;
        this.pathImagen = "src/Helpers/ImagenesProductos/No-Image-Placeholder.jpg";
        this.imagen = ImageIO.read(new File(pathImagen));
    }
    
    
    public Producto(String nombre, String descripcion, Tipo unTipo, FormaVenta unaVenta, String imagenPath) {
        this(nombre,descripcion,unTipo,unaVenta);
        try{
            this.pathImagen = imagenPath;
            this.imagen = ImageIO.read(new File(imagenPath));
        } catch (IOException e){
            
        }
    }
    
    public Producto(String nombre, String descripcion, Tipo unTipo, FormaVenta unaVenta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = unTipo;
        this.venta = unaVenta;
        this.pathImagen = "src/Helpers/ImagenesProductos/Uvas.jpg";
        try{
            this.imagen = ImageIO.read(new File(pathImagen));
        } catch (IOException e){
            System.out.println("Imagen no encontrada");
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
        return tipo;
    }

    public void setTipo(Tipo unTipo) {
        this.tipo = unTipo;
    }

    public FormaVenta getVenta() {
        return venta;
    }

    public void setUnaVenta(FormaVenta unaVenta) {
        this.venta = unaVenta;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }

    public void setImagen(BufferedImage imagen) {
        // this.imagen = ImageIO.read(new File(name + ".png"));
        // como carajo se hace esto?
    }
    /*@Override
    public boolean equals(Object obj) {
        return this.getNombre().equalsIgnoreCase((Producto)obj).getNombre();
    }*/    
    
    @Override
    public String toString() {
        return this.getNombre();
    }
    
    
    @Override
    public boolean equals(Object obj) {
        boolean retVal = false;

        if (obj instanceof Producto ptr) {
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
    public int compareTo(Producto o) {
        // Comparación basada en atributo1
        int compTipo = this.getTipo().compareTo(o.getTipo());
        if (compTipo != 0) {
            return compTipo;
        }
        
        // Si los atributos 1 son iguales, compara por atributo2
        return this.getNombre().compareTo(o.getNombre());
    }
    
}
