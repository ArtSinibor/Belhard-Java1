package by.belhard.j26.homework.homework07.Pets;

public abstract class AbstractPet implements Pets {

    private String name;

    public AbstractPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
