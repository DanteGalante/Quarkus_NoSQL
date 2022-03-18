package dev.djov.entity;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private int age;
    
    public Person(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJsonPattern() {
        return "{\"id\":\""+id+"\",\"name\":\""+name+"\",\"age\":"+age+"}";
    }
}
