package com.example;
import java.io.Serializable;
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre, apellido;
    private int edad;
    public Persona(String nombre, String apellido, int edad) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public int obtenerEdad()
    {
        return edad;
    }
    public String obtenerNombre() 
    {
        return nombre;
    }
    public String obtenerApellido() 
    {
        return apellido;
    }
    public void cambiarEdad(int edad)
    {
        this.edad = edad;
    }
    public void cambiarNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void cambiarApellido(String apellido)
    {
        this.apellido = apellido;
    }
}
