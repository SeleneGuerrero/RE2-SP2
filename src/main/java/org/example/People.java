package org.example;

/**
 * Clase de ejemplo para mapear objetos del JSON.
 */
public class People {
    //Cada campo (name, age, country, id) representa un dato que viene en el JSON
    private String name;
    private int age;
    private String country;
    private int id;

    //Este es el constructor. Sirve para crear un objeto People con valores.
    public People(String name, int age, String country, int id) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.id = id;
    }
    //Los getters. Sirven para obtener el valor de cada campo.
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public int getId() { return id; }
}

