package org.example;

//Importamos clases necesarias.
import org.example.People;

import java.io.IOException;
import java.util.List;

//Clase principal con el famoso main, donde empieza a correr el programa.
// Clase principal para probar la lectura de JSON y escritura de CSV.

public class Main {
    public static void main(String[] args) {
        //Creamos objetos de nuestras clases para poder usarlas.
        JsonReader reader = new JsonReader();
        CsvWriter writer = new CsvWriter();

        try {
            //Llamamos al JsonReader para leer el archivo JSON y obtener la lista de personas.
            // 1. Leer JSON
            List<People> personas = reader.readJsonFile("src/main/java/org/example/person.json");

            //Llamamos al CsvWriter para crear el CSV con esas personas.
            // 2. Escribir CSV
            writer.writeCsvFile("src/main/java/org/example/output.csv", personas);

        //Si hubo un error leyendo/escribiendo archivos, lo mostramos en consola.
        } catch (IOException e) {
            System.err.println("Error en el proceso: " + e.getMessage());
        }
    }
}
