/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

/**
 *
 * @author agustin973
 */
public class Dueño implements Serializable{
    private static final long serialVersionUID = 1L;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dueño unDueño = (Dueño) obj;
        return nombre.equals(unDueño.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + this.edad;
        hash = 41 * hash + this.añosDeExp;
        return hash;
    }
    
    public String toString(){
        return this.getNombre();
    }
}
