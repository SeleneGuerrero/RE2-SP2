package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de leer archivos JSON y convertirlos en una lista de objetos {@link People}.
 */
public class JsonReader {

    /**
     * Lee un archivo JSON desde una ruta específica y lo convierte en una lista de objetos {@link People}.
     *
     * <p>El archivo JSON debe contener un array de personas con las claves:
     * <b>name</b>, <b>age</b>, <b>country</b> e <b>id</b>.</p>
     *
     * @param filePath Ruta del archivo JSON a leer.
     * @return Una lista de objetos {@link People} construida a partir de los datos del JSON.
     * @throws IOException Si ocurre un error al leer el archivo (por ejemplo, si no existe).
     */
    public List<People> readJsonFile(String filePath) throws IOException {
        List<People> personas = new ArrayList<>();

        try {
            // Leemos todo el archivo JSON como texto
            String content = Files.readString(Paths.get(filePath));

            // Convertimos el texto en un JSONArray (lista de objetos JSON).
            JSONArray jsonArray = new JSONArray(content);

            // Recorremos el array JSON con un bucle for.
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);

                // Creamos un objeto People con los datos del JSON.
                People persona = new People(
                        obj.getString("name"),
                        obj.getInt("age"),
                        obj.getString("country"),
                        obj.getInt("id")
                );

                // Agregamos cada persona a la lista.
                personas.add(persona);
            }

        } catch (IOException e) {
            // Si el archivo no existe o no se puede leer → IOException.
            System.err.println("Error al leer el archivo: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            // Si el JSON está mal escrito → Exception.
            System.err.println("Error al parsear el JSON: " + e.getMessage());
        }

        // Finalmente devolvemos la lista de personas.
        return personas;
    }
}
