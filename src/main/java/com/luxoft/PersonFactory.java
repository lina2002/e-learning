package com.luxoft;

/**
 * Created by lina on 15.07.15.
 */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person");
        return new Person(id, name);
    }
}
