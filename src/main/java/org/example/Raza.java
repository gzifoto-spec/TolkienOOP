package org.example;

public abstract class Raza {

    private String name;
    private String language;
    private String alignment;
    private int age;

    public Raza(String name, String language, String alignment, int age){
        this.name = name;
        this.language = language;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Nombre: " + name);
        System.out.println("Lengua: " + language);
        System.out.println("Alineamiento: " + alignment);
        System.out.println("Edad: " + age);
    }
}
