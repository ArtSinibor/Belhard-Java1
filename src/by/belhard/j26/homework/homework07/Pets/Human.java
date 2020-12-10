package by.belhard.j26.homework.homework07.Pets;

import by.belhard.j26.homework.homework07.Pets.Pets;

public class Human {

    private String name;
    private Pets pet;

    public Human(String name, Pets pet) {
        this.name = name;
        this.pet = pet;
    }

    public Human(String name) {
        this(name, null);
    }

    public void play() {
        play(this.pet);
    }

    public void play(Pets pet) {
        System.out.println(name + "is playing with " + (pet != null ? pet : "nothing"));
    }

    public Pets getPet() {
        return pet;
    }

    @Override
    public String toString() {

        return String.format("%s has %s", name, pet != null ? "pet " + pet : "no pet");
    }

}
