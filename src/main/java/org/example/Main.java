package org.example;

import org.example.People;
import java.io.IOException;
import java.util.List;

/**
 * Clase principal para ejecutar el programa.
 *
 * <p>Este programa realiza dos tareas principales:</p>
 * <ol>
 *   <li>Lee un archivo JSON y lo convierte en una lista de personas.</li>
 *   <li>Escribe esa lista de personas en un archivo CSV.</li>
 * </ol>
 */
public class Main {

    /**
     * Metodo principal (punto de entrada del programa).
     *
     * @param args Argumentos de línea de comandos (no se usan en este programa).
     */
    public static void main(String[] args) {
        // Creamos objetos de nuestras clases para poder usarlas.
        JsonReader reader = new JsonReader();
        CsvWriter writer = new CsvWriter();

        try {
            // 1. Llamamos al JsonReader para leer el archivo JSON y obtener la lista de personas.
            List<People> personas = reader.readJsonFile("src/main/java/org/example/person.json");

            // 2. Llamamos al CsvWriter para crear el CSV con esas personas.
            writer.writeCsvFile("src/main/java/org/example/output.csv", personas);

        } catch (IOException e) {
            // Si hubo un error leyendo/escribiendo archivos, lo mostramos en consola.
            System.err.println("Error en el proceso: " + e.getMessage());
        }
    }
}
