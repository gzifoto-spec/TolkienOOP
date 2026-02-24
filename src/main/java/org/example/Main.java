package org.example;

import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Raza> personajes = new ArrayList<>();

        personajes.add(new Hombre("Aragorn", "Westron", "Legal", 87, "Gondor", "Isildur", true));
        personajes.add(new Hombre("Boromir", "Westron", "Legal", 41, "Gondor", "Denethor", true));
        personajes.add(new Hombre("Théoden", "Rohírrimo", "Legal", 71, "Rohan", "Eorl el Joven", true));

        personajes.add(new Elfo("Legolas", "Sindarin", "Legal", 2931, "Sindarin", "Ninguno", true));
        personajes.add(new Elfo("Galadriel", "Quenya", "Legal", 7000, "Noldor", "Nenya", true));
        personajes.add(new Elfo("Elrond", "Sindarin", "Legal", 6521, "Sindarin", "Vilya", true));

        personajes.add(new Enano("Gimli", "Khuzdul", "Legal", 139, "Durin", "Erebor", 0.45f));
        personajes.add(new Enano("Thorin", "Khuzdul", "Neutral", 195, "Durin", "Erebor", 0.65f));
        personajes.add(new Enano("Balin", "Khuzdul", "Legal", 231, "Durin", "Moria", 0.55f));

        personajes.add(new Hobbit("Frodo", "Westron", "Legal", 50, "La Comarca", "Harfoot", 6));
        personajes.add(new Hobbit("Samwise", "Westron", "Legal", 38, "La Comarca", "Harfoot", 7));
        personajes.add(new Hobbit("Merry", "Westron", "Legal", 36, "Buckland", "Stoor", 6));

        personajes.add(new Orco("Azog", "Orkish", "Caótico", 180, "Uruk-hai", "Sauron", 17));
        personajes.add(new Orco("Bolg", "Orkish", "Caótico", 150, "Uruk-hai", "Azog", 12));
        personajes.add(new Orco("Gothmog", "Orkish", "Caótico", 120, "Orco común", "Sauron", 8));

        for (Raza personaje : personajes) {
            personaje.printDetails();
        }
    }
}
