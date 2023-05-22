/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Dominio.Mercado;
import Interfaz.MenuPpal;
public class Obligatorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mercado m = new Mercado();
        MenuPpal menu = new MenuPpal (m);
        menu.setVisible(true);
    }
    
}
