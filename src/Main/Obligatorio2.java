// Gabriel Machado 318697, Agustin Silva 310087
package Main;

import Dominio.*;
import Dominio.Producto.FormaVenta;
import Dominio.Producto.Tipo;
import Interfaz.MenuPpal;
import javax.swing.JOptionPane;

public class Obligatorio2 {

    public static void main(String[] args) {
 
      MenuPpal menu = new MenuPpal (inicio());
      menu.setVisible(true);
      
    }
    
    public static Mercado inicio(){
        
        Mercado mercadoACargar = null;
        
        String[] opciones = {"Cargar último mercado utilizado", "Crear nuevo mercado",
        "Cargar productos únicamente"};
        
        int opcionSeleccionada = JOptionPane.showOptionDialog(null,
        "Elige un método de inicio", "Inicio", JOptionPane.DEFAULT_OPTION,
        JOptionPane.PLAIN_MESSAGE, null, opciones,opciones[0]);
        
        switch(opcionSeleccionada){
            case 0:
                mercadoACargar = Persistencia.cargarMercado();
                break;
            case 1:
                mercadoACargar = new Mercado();
                break;
            case 2:
                mercadoACargar = new Mercado();
                cargarProductosEnMercado(mercadoACargar);
                break;
                
        }
        return mercadoACargar;
    }
    
    public static void cargarProductosEnMercado(Mercado mercado){
        ArchivoLectura arch = new ArchivoLectura(
                "src/Helpers/ImagenesProductos/productos.txt");
        
        while(arch.hayMasLineas()){
            String[] datosProd = arch.linea().split("@");
            Tipo tipo;
            FormaVenta formaVenta;
            if(datosProd[2].equals("Fruta")){
                tipo = Tipo.Fruta;
            } else {
                tipo = Tipo.Verdura;
            }
            if(datosProd[3].equals("Kilogramo")){
                formaVenta = FormaVenta.Kilogramo;
            } else {
                formaVenta = FormaVenta.Unidad;
            }
            String pathImagen = "src/Helpers/ImagenesProductos/" + datosProd[4];
            Producto unProducto = new Producto(datosProd[0], datosProd[1], 
                    tipo, formaVenta, pathImagen);
            mercado.agregarListaProductos(unProducto);
        }
        arch.cerrar();
    }
    
}
