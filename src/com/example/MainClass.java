package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        try 
        {
            List<Persona> personas = new ArrayList();
            personas.add(new Persona("Andrés", "León", 20));
            personas.add(new Persona("Nadia", "Terranova", 20));
            personas.add(new Persona("Mario", "Asanza", 20));
            FileController.guardarDatos(personas);
            personas = (List<Persona>) FileController.obtenerDatos();
            for(Persona persona:personas) 
            {
                System.out.println(persona.obtenerNombre() + "|" + persona.obtenerApellido() + "|" + 
                        persona.obtenerEdad());
            }
        }
        catch (IOException | ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
