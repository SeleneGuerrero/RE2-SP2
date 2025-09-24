package org.example;

/**
 * Clase que representa a una persona obtenida desde un archivo JSON.
 *
 * <p>Contiene los atributos básicos de una persona: nombre, edad, país e identificador.</p>
 */
public class People {

    /** Nombre de la persona. */
    private String name;

    /** Edad de la persona. */
    private int age;

    /** País de origen de la persona. */
    private String country;

    /** Identificador único de la persona. */
    private int id;

    /**
     * Constructor para crear un objeto {@code People}.
     *
     * @param name Nombre de la persona.
     * @param age Edad de la persona.
     * @param country País de la persona.
     * @param id Identificador único de la persona.
     */
    public People(String name, int age, String country, int id) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.id = id;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getName() { return name; }

    /**
     * Obtiene la edad de la persona.
     *
     * @return Edad de la persona.
     */
    public int getAge() { return age; }

    /**
     * Obtiene el país de la persona.
     *
     * @return País de origen de la persona.
     */
    public String getCountry() { return country; }

    /**
     * Obtiene el identificador único de la persona.
     *
     * @return Identificador de la persona.
     */
    public int getId() { return id; }
}
