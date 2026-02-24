package org.example;

public class Elfo extends Raza{

    private String kind;
    private String elvenRing;
    private boolean isInmortal;

    public Elfo(String name, String language, String alignment, int age, String kind, String elvenRing, boolean isInmortal) {
        super(name, language, alignment, age);
        this.kind = kind;
        this.elvenRing = elvenRing;
        this.isInmortal = isInmortal;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getElvenRing() {
        return elvenRing;
    }

    public void setElvenRing(String elvenRing) {
        this.elvenRing = elvenRing;
    }

    public boolean isInmortal() {
        return isInmortal;
    }

    public void setInmortal(boolean inmortal) {
        isInmortal = inmortal;
    }

    @Override
    public void printDetails() {
        System.out.println("=== ELFO ===");
        super.printDetails();
        System.out.println("Clase: " + kind);
        System.out.println("Portador del Anillo: " + elvenRing);
        System.out.println("Inmortal: "  + (isInmortal ? "Inmortal" : "Caído en Batalla"));
    }

}
