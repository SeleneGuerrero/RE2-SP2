package org.example;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Clase encargada de escribir datos en un archivo CSV usando la librería OpenCSV.
 */
public class CsvWriter {

    /**
     * Escribe una lista de objetos {@link People} en un archivo CSV.
     *
     * <p>El archivo CSV generado contendrá una cabecera con las columnas:
     * <b>ID</b>, <b>Name</b>, <b>Age</b> y <b>Country</b>, seguidas de una fila por cada persona.</p>
     *
     * @param filePath Ruta del archivo CSV de salida.
     * @param personas Lista de objetos {@link People} a escribir en el archivo.
     */
    public void writeCsvFile(String filePath, List<People> personas) {
        // Abrimos un CSVWriter (con FileWriter) para escribir en el archivo.
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Creamos la cabecera del CSV (los títulos de columna).
            String[] header = {"ID", "Name", "Age", "Country"};
            writer.writeNext(header);

            // Recorremos la lista de personas y escribimos cada una como una fila de texto.
            for (People p : personas) {
                String[] row = {
                        String.valueOf(p.getId()),
                        p.getName(),
                        String.valueOf(p.getAge()),
                        p.getCountry()
                };
                writer.writeNext(row);
            }

            // Mostramos un mensaje en consola cuando se termina.
            System.out.println("Archivo CSV creado ");

        } catch (IOException e) {
            // Capturamos errores si algo sale mal al guardar el archivo.
            System.err.println("Error al escribir el archivo CSV: " + e.getMessage());
        }
    }
}
