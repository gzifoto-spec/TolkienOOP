package org.example;

public class Hombre extends Raza{

    private String kingdom;
    private String lineage;
    private boolean isNoble;

    public Hombre(String name, String language, String alignment, int age, String kingdom, String lineage, boolean isNoble) {
        super(name, language, alignment, age);
        this.kingdom = kingdom;
        this.lineage = lineage;
        this.isNoble = isNoble;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getLineage() {
        return lineage;
    }

    public void setLineage(String lineage) {
        this.lineage = lineage;
    }

    public boolean isNoble() {
        return isNoble;
    }

    public void setNoble(boolean noble) {
        isNoble = noble;
    }

    @Override
    public void printDetails() {
        System.out.println("=== HOMBRE ===");
        super.printDetails();
        System.out.println("Reino: " + kingdom);
        System.out.println("Linaje: " + lineage);
        System.out.println("Estamento: " + (isNoble ? "Noble" : "Plebeyo"));
    }
}
