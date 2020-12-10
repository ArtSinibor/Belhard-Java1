package by.belhard.j26.homework.homework07.Pets;

public class Fish extends AbstractPet{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void play() {

        System.out.println(this.getName() + " is swimming by circle");
    }

    @Override
    public String toString() {

        return String.format("Fish '%s'", getName());
    }
}
