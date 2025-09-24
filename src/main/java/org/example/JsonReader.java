package org.example;
//Importamos las clases de la librería org.json que permiten leer JSON.
import org.json.JSONArray;
import org.json.JSONObject;

//Importamos utilidades de Java para
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


//Creamos una clase llamada JsonReader
public class JsonReader {

    //Creamos un metodo que recibe la ruta del archivo y devuelve una lista de People.
    public List<People> readJsonFile(String filePath) throws IOException {
        List<People> personas = new ArrayList<>();

        try {
            //Leemostodo el archivo JSON como texto
            String content = Files.readString(Paths.get("src/main/java/org/example/person.json"));
            //Convertimos el texto en un JSONArray (lista de objetos JSON).
            JSONArray jsonArray = new JSONArray(content);

            //Recorremos el array JSON con un for.
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);

                //Creamos un objeto Persona con los datos del JSON.
                People persona = new People(
                        obj.getString("name"),
                        obj.getInt("age"),
                        obj.getString("country"),
                        obj.getInt("id")
                );
                //Agregamos cada persona a la lista.
                personas.add(persona);
            }
        //Capturamos errores:
            //
            //Si el archivo no existe o no se puede leer → IOException.
            //
            //Si el JSON está mal escrito → Exception.
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.err.println("Error al parsear el JSON: " + e.getMessage());
        }
        //Finalmente devolvemos la lista de personas.
        return personas;
    }
}

