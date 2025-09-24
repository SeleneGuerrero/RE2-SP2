package org.example;

//mportamos la librería OpenCSV que nos facilita escribir archivos CSV.
//FileWriter → para crear archivos.
//
//IOException → errores al escribir.
//
//List → la lista de personas.
import com.opencsv.CSVWriter; // Clase de OpenCSV
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


//Creamos la clase CsvWriter. Clase encargada de escribir datos en un archivo CSV usando OpenCSV.

public class CsvWriter {

    //Definimos un metodo que recibe:
    //
    //filePath → ruta del archivo CSV de salida.
    //
    //personas → lista de personas a guardar.
    public void writeCsvFile(String filePath, List<People> personas) {
        //Abrimos un CSVWriter (con FileWriter) para escribir en el archivo.
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Creamos la cabecera del CSV (los títulos de columna).
            //Cabecera
            String[] header = {"ID", "Name", "Age", "Country"};
            writer.writeNext(header);

            //Recorremos la lista de personas y escribimos cada una como una fila de texto.
            // Filas
            for (People p : personas) {
                String[] row = {
                        String.valueOf(p.getId()),
                        p.getName(),
                        String.valueOf(p.getAge()),
                        p.getCountry()
                };
                writer.writeNext(row);
            }

            //Mostramos un mensaje en consola cuando se termina.
            System.out.println("Archivo CSV creado ");

        //Capturamos errores si algo sale mal al guardar el archivo.
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo CSV: " + e.getMessage());
        }
    }
}

