
package prueba;

import Dominio.*;
import Dominio.Producto.FormaVenta;
import Dominio.Producto.Tipo;
import Interfaz.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class prueba {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      Dueño d1 = new Dueño("Gab", 32, 120);
      Dueño d2 = new Dueño("May", 18, 1);
      Dueño d3 = new Dueño("Jen", 48, 10);
      Dueño d4 = new Dueño("Ray", 26, 15);
      Dueño d5 = new Dueño("Sal", 35, 12);
      
      
      
      Producto p1 = new Producto("Manzana", "rica", Tipo.Fruta, FormaVenta.Kilogramo);
      Producto p2 = new Producto("Pera", "rica", Tipo.Fruta, FormaVenta.Unidad);
      Producto p3 = new Producto("Naranja", "rica", Tipo.Verdura, FormaVenta.Kilogramo);
      Producto p4 = new Producto("Sandia", "rica", Tipo.Fruta, FormaVenta.Unidad);
      Producto p5 = new Producto("Lechuga", "rica", Tipo.Verdura, FormaVenta.Unidad);
      
      ArrayList<Producto> oferta1 = new ArrayList<>();
      oferta1.add(p1);
      oferta1.add(p2);
      ArrayList<Producto> oferta2 = new ArrayList<>();
      oferta2.add(p3);
      oferta2.add(p2);
      ArrayList<Producto> oferta3 = new ArrayList<>();
      oferta3.add(p1);
      oferta3.add(p4);
      ArrayList<Producto> oferta4 = new ArrayList<>();
      oferta4.add(p1);
      oferta4.add(p2);
      oferta4.add(p5);
      
      Mayorista m1 = new Mayorista("123", "FruteriaA", "calle 2", oferta1);
      Mayorista m2 = new Mayorista("987", "FruteriaB", "calle 54", oferta2);
      Mayorista m3 = new Mayorista("548", "FruteriaC", "calle 3", oferta3);
      Mayorista m4 = new Mayorista("456", "FruteriaD", "calle 1", oferta4);
      Mayorista m5 = new Mayorista("567", "FruteriaE", "calle 8", oferta2);
      
      //Puesto(String id, Dueño dueño, String ubicacion, int cantEmpleados)
      Puesto puesto1 = new Puesto("McDonalds", d1, "Este", 10);
      Puesto puesto2 = new Puesto("BurgerKing", d2, "Oeste", 15);
      Puesto puesto3 = new Puesto("Mostaza", d3, "Sur", 1);
      Puesto puesto4 = new Puesto("Barnys", d4, "Norte", 0);
      Puesto puesto5 = new Puesto("Chorripan", d5, "Centro", 5);
      
      Mercado mercado = new Mercado();
      mercado.agregarListaMayoristas(m1);
      mercado.agregarListaMayoristas(m2);
      mercado.agregarListaMayoristas(m3);
      mercado.agregarListaMayoristas(m4);
      mercado.agregarListaMayoristas(m5);
      mercado.agregarListaProductos(p1);
      mercado.agregarListaProductos(p2);
      mercado.agregarListaProductos(p3);
      mercado.agregarListaProductos(p4);
      mercado.agregarListaProductos(p5);
      mercado.agregarListaDueños(d1);
      mercado.agregarListaDueños(d2);
      mercado.agregarListaDueños(d3);
      mercado.agregarListaDueños(d4);
      mercado.agregarListaDueños(d5);
      mercado.agregarListaPuestos(puesto1);
      mercado.agregarListaPuestos(puesto2);
      mercado.agregarListaPuestos(puesto3);
      mercado.agregarListaPuestos(puesto4);
      mercado.agregarListaPuestos(puesto5);
      
      VentanaVenta vent = new VentanaVenta(mercado);
      vent.setVisible(true);
      
      /*
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream ("salida"));
      
      out.writeObject(mercado);
      out.close();
      
      
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("salida"));
      
      Mercado mercado2 = (Mercado)in.readObject();
      in.close();
      */
      
    }
    
}
