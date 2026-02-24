package org.example;

public class Orco extends Raza{

    private String kind;
    private String obedience;
    private int scarCount;

    public Orco(String name, String language, String alignment, int age, String kind, String obedience, int scarCount) {
        super(name, language, alignment, age);
        this.kind = kind;
        this.obedience = obedience;
        this.scarCount = scarCount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getObedience() {
        return obedience;
    }

    public void setObedience(String obedience) {
        this.obedience = obedience;
    }

    public int getScarCount() {
        return scarCount;
    }

    public void setScarCount(int scarCount) {
        this.scarCount = scarCount;
    }

    @Override
    public void printDetails(){
        System.out.println("=== ORCO ===");
        super.printDetails();
        System.out.println("Clase: " + kind);
        System.out.println("Obediencia: " + obedience);
        System.out.println("Cruces de guerra: " + scarCount);
    }

}
