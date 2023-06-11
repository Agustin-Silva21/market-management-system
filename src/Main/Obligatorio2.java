/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Dominio.*;
import Interfaz.MenuPpal;
import java.util.ArrayList;
public class Obligatorio2 {

    public static void main(String[] args) {


      Dueño d1 = new Dueño("Gab", 32, 120);
      Dueño d2 = new Dueño("May", 18, 1);
      Dueño d3 = new Dueño("Jen", 48, 10);
      Dueño d4 = new Dueño("Ray", 26, 15);
      Dueño d5 = new Dueño("Sal", 35, 12);

      String pathDirectorio = System.getProperty("user.dir") + "/src/Helpers";
      Producto p1 = new Producto("Manzana", "No arenosa", Producto.Tipo.Fruta, Producto.FormaVenta.Kilogramo,pathDirectorio + "/imagenesProductos/Manzana.jpg");
      Producto p2 = new Producto("Pera", "Peras de lo mas dulces", Producto.Tipo.Fruta, Producto.FormaVenta.Unidad,pathDirectorio + "/imagenesProductos/Pera.jpg");
      Producto p3 = new Producto("Higo", "Higos de estacion", Producto.Tipo.Verdura, Producto.FormaVenta.Unidad,pathDirectorio + "/imagenesProductos/Esparrago.jpg");
      Producto p4 = new Producto("Kiwi", "Kiwis bien verdes", Producto.Tipo.Fruta, Producto.FormaVenta.Kilogramo,pathDirectorio + "/imagenesProductos/Kiwi.jpg");
      Producto p5 = new Producto("Lechuga", "Bien fresca", Producto.Tipo.Verdura, Producto.FormaVenta.Unidad,pathDirectorio + "/imagenesProductos/Lechuga.jpg");
      
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

      //Mayorista 1  = Manzana,Pera.
      Mayorista m1 = new Mayorista("123", "FruteriaA", "calle 2", oferta1);
      // Mayorista 2 = Higo,Pera.
      Mayorista m2 = new Mayorista("987", "FruteriaB", "calle 54", oferta2);
      // Mayorista 3 = Manzana,Kiwi.
      Mayorista m3 = new Mayorista("548", "FruteriaC", "calle 3", oferta3);
      // Mayorista 4 = Manzana,Pera,Lechuga.
      Mayorista m4 = new Mayorista("456", "FruteriaD", "calle 1", oferta4);
      // Mayorista 5 = Higo,Pera.
      Mayorista m5 = new Mayorista("567", "FruteriaE", "calle 8", oferta2);
      
      Puesto puesto1 = new Puesto("McDonalds", d1, "Este", 10);
      Puesto puesto2 = new Puesto("BurgerKing", d2, "Oeste", 15);
      Puesto puesto3 = new Puesto("Mostaza", d3, "Sur", 1);
      Puesto puesto4 = new Puesto("Barneys", d4, "Norte", 0);
      Puesto puesto5 = new Puesto("Chorripan", d5, "Centro", 5);



      Movimiento McDonaaldsCompra1 = new Compra(puesto1, m1, p1, 1000, 5.5f);
      Movimiento McDonaaldsCompra2 = new Compra(puesto1, m1, p2, 2000, 10.5f);
      Movimiento McDonaldsVenta1 = new Movimiento(puesto1, p1, 300, 0.5f);
      Movimiento McDonaldsVenta2 = new Movimiento(puesto1, p1, 200, 0.75f);
      Movimiento McDonaldsVenta3 = new Movimiento(puesto1, p2, 300, 1.5f);


      Movimiento BurgerKingCompra1 = new Compra(puesto2, m2, p3, 500, 2.5f);
      Movimiento BurgerKingCompra2 = new Compra(puesto2, m2, p2, 1000, 5.5f);
      Movimiento BurgerKingVenta1 = new Movimiento(puesto2, p3, 300, 0.5f);
      Movimiento BurgerKingVenta2 = new Movimiento(puesto2, p2, 300, 0.75f);
      Movimiento BurgerKingVenta3 = new Movimiento(puesto2, p2, 300, 1.5f);

      Movimiento MostazaCompra1 = new Compra(puesto3, m3, p1, 1000, 5.5f);
      Movimiento MostazaCompra2 = new Compra(puesto3, m4, p5, 1000, 5.5f);

      Movimiento MostazaCompra1 = new Compra(puesto3, m3, p1, 1000, 5.5f);
        Movimiento MostazaCompra2 = new Compra(puesto3, m3, p4, 1000, 5.5f);


      Movimiento m = new Movimiento(puesto1, p1, 10, 10);
      Movimiento m2 = new Movimiento(puesto1, p2, 2, 5);
      Movimiento m3 = new Movimiento(puesto1, p3, 5, 2);
      Movimiento m4 = new Movimiento(puesto1, p4, 3, 3);
      Movimiento m5 = new Movimiento(puesto1, p5, 1, 1);
      Movimiento m6 = new Compra(puesto1, m1, p1, 10, 10);
      Movimiento m7 = new Compra(puesto1, m1, p2, 2, 5);
      Movimiento m8 = new Compra(puesto2, m1, p3, 5, 2);
      Movimiento m9 = new Compra(puesto1, m1, p4, 3, 3);
      Movimiento m10 = new Compra(puesto1, m1, p5, 1, 1);

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
      MenuPpal menu = new MenuPpal (mercado);
      menu.setVisible(true);
    }
    
}
