package org.example;

public class Enano extends Raza{

    private String clan;
    private String stronghold;
    private float beardLengthM;

    public Enano(String name, String language, String alignment, int age, String clan, String stronghold, float beardLengthM) {
        super(name, language, alignment, age);
        this.clan = clan;
        this.stronghold = stronghold;
        this.beardLengthM = beardLengthM;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getStronghold() {
        return stronghold;
    }

    public void setStronghold(String stronghold) {
        this.stronghold = stronghold;
    }

    public float getBeardLengthM() {
        return beardLengthM;
    }

    public void setBeardLengthM(float beardLengthM) {
        this.beardLengthM = beardLengthM;
    }

    @Override
    public void printDetails(){
        System.out.println("=== ENANO ===");
        super.printDetails();
        System.out.println("Clan: " + clan);
        System.out.println("Fortaleza: " + stronghold);
        System.out.println("Longitud de la barba: " + beardLengthM);
    }

}
