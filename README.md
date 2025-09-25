# RE2-SP2

# Proyecto JSON a CSV en Java

Este proyecto permite **leer datos desde un archivo JSON** y **exportarlos a un archivo CSV** usando las librerías [`org.json`](https://mvnrepository.com/artifact/org.json/json) y [`OpenCSV`](http://opencsv.sourceforge.net/).

## 📂 Estructura del Proyecto

src/main/java/org/example/
│
├── Main.java # Clase principal, ejecuta el flujo completo

├── People.java # Clase modelo que representa una persona

├── JsonReader.java # Clase para leer el JSON y convertirlo en objetos

├── CsvWriter.java # Clase para escribir los datos en CSV

└── person.json # Archivo de entrada con los datos en formato JSON


## 🚀 Requisitos

- **Java 17** o superior  
- **Maven** para la gestión de dependencias  

### Dependencias Maven

En tu `pom.xml` asegúrate de incluir:

```xml
<dependencies>
    <!-- Librería JSON -->
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20240303</version>
    </dependency>

    <!-- Librería OpenCSV -->
    <dependency>
        <groupId>com.opencsv</groupId>
        <artifactId>opencsv</artifactId>
        <version>5.9</version>
    </dependency>
</dependencies>



▶️ Ejecución

El programa leerá los datos desde person.json.

Generará el archivo output.csv en la carpeta src/main/java/org/example/.

Ejemplo de salida en consola:
Archivo CSV creado



👤 Autor
Proyecto desarrollado como ejemplo educativo para la conversión de datos JSON → CSV en Java.

---

📌 En este README:  
- Dejé todo listo para que alguien pueda clonar, compilar y ejecutar.  
- Incluí dependencias exactas de **Maven**.  
  
