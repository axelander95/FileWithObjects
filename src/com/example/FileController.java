package com.example;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class FileController {
    private static final String NOMBRE_DE_ARCHIVO = "persona.bin";
    public static void guardarDatos(Object datos)  throws IOException
    {
        try (FileOutputStream output = new FileOutputStream(NOMBRE_DE_ARCHIVO);ObjectOutputStream stream = new ObjectOutputStream(output)) {
            stream.writeObject(datos);
        }
    }
    public static Object obtenerDatos () throws IOException, ClassNotFoundException
    {
        Object datos;
        try (FileInputStream input = new FileInputStream(NOMBRE_DE_ARCHIVO)) {
            try (ObjectInputStream stream = new ObjectInputStream(input)) {
                datos = stream.readObject();
            }
        }
        return datos;
    }
}
