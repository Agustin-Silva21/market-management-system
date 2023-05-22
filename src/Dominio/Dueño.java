/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author agustin973
 */
public class Dueño {
    private String nombre;
    private int edad;
    private int añosDeExp;

    public Dueño(String nombre, int edad, int añosDeExp) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosDeExp = añosDeExp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosDeExp() {
        return añosDeExp;
    }

    public void setAñosDeExp(int añosDeExp) {
        this.añosDeExp = añosDeExp;
    }
    
    @Override
    
    public String toString(){
        return this.getNombre();
    }
}
