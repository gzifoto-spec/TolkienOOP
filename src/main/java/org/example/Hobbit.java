package org.example;

public class Hobbit extends Raza{

    private String shire;
    private String kind;
    private int mealsPerDay;

    public Hobbit(String name, String language, String alignment, int age, String shire, String kind, int mealsPerDay) {
        super(name, language, alignment, age);
        this.shire = shire;
        this.kind = kind;
        this.mealsPerDay = mealsPerDay;
    }

    public String getShire() {
        return shire;
    }

    public void setShire(String shire) {
        this.shire = shire;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public void setMealsPerDay(int mealsPerDay) {
        this.mealsPerDay = mealsPerDay;
    }

    @Override
    public void printDetails(){
        System.out.println("=== HOBBIT ===");
        super.printDetails();
        System.out.println("Condado: " + shire);
        System.out.println("Estirpe: " + kind);
        System.out.println("Comidas por día: " + mealsPerDay);
    }
}
