# 💍 Middle-earth Characters: OOP & Inheritance

This project is a practical implementation of the fundamental pillars of Object-Oriented Programming (OOP) in Java. Using the "Lord of the Rings" universe, it demonstrates the use of inheritance, encapsulation, polymorphism, and data modeling.

## 📋 Project Description

The goal is to manage a catalog of Middle-earth characters belonging to 5 different races. Each race inherits from a common superclass, maintaining private attributes and demonstrating polymorphic behavior by printing their specific details.

## 🚀 Applied OOP Concepts

- **Encapsulation:** All class attributes are defined as `private`. Access and modification of data are performed exclusively through public Getters and Setters.

- **Inheritance:** A superclass named `Raza` has been implemented, from which the specific classes inherit: `Hombre` (Human), `Elfo` (Elf), `Enano` (Dwarf), `Hobbit`, and `Orco` (Orc).

- **Polymorphism:** The superclass defines a `printDetails()` method that is overridden by each subclass to display unique information specific to each race.

- **Abstraction:** Modeling real-world (or fantasy) entities into logical code structures.

## 🧬 Class Structure

| Class  | Common Attributes (Superclass)      | Specific Attributes            |
|--------|-------------------------------------|--------------------------------|
| Raza   | name, language, alignment, age      | —                              |
| Hombre | inherited                           | kingdom, lineage, isNoble      |
| Elfo   | inherited                           | kind, elvenRing, isImmortal    |
| Enano  | inherited                           | clan, stronghold, beardLengthM |
| Hobbit | inherited                           | shire, kind, mealsPerDay       |
| Orco   | inherited                           | kind, obedience, scarCount     |

## 📊 Data Insertion

The system automatically initializes 15 characters (3 per race) from the `Main` class:

- **Humans:** Aragorn, Boromir, Théoden
- **Elves:** Legolas, Galadriel, Elrond
- **Dwarves:** Gimli, Thorin, Balin
- **Hobbits:** Frodo, Samwise, Merry
- **Orcs:** Azog, Bolg, Gothmog

## 💻 How to Run

Open the project in IntelliJ IDEA and run the `Main` class directly.
