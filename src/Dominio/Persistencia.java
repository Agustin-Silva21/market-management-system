// Gabriel Machado 318697, Agustin Silva 310087
package Dominio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;


public class Persistencia {
    public static void guardarMercado(Mercado mercado){
        String ruta;
        if(mercado.seEjecutaDesdeJar()){
            ruta = "Archivos/mercado.txt";
        } else{
            ruta = "src/Archivos/mercado.txt";
        }
        try {
            ObjectOutputStream mercadoAGuardar = new ObjectOutputStream(new FileOutputStream(ruta));
            mercadoAGuardar.writeObject(mercado);
            mercadoAGuardar.close();
            JOptionPane.showMessageDialog(null, "Mercado guardado correctamente");
        } catch (IOException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, 
                    "No es posible guardar el Mercado");
        }
    }
    
    public static Mercado cargarMercado(Mercado mercado2) {
        String ruta;
        if(mercado2.seEjecutaDesdeJar()){
            ruta = "Archivos/mercado.txt";
        } else{
            ruta = "src/Archivos/mercado.txt";
        }
        Object mercado = new Mercado();
        try {
            ObjectInputStream mercadoGuardado = new ObjectInputStream(
                    new FileInputStream(ruta));
            mercado = mercadoGuardado.readObject();
            mercadoGuardado.close();
            JOptionPane.showMessageDialog(null, 
                    "Mercado cargado correctamente");
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                    "No es posible cargar el mercado");
        }
        return (Mercado) mercado;
    }
    
}
