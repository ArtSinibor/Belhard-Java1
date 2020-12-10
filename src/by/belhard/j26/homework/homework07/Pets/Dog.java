package by.belhard.j26.homework.homework07.Pets;

public class Dog extends AbstractPet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {

        System.out.println(this.getName() + " says 'Woof-woof'");
    }

    @Override
    public String toString() {

        return String.format("Dog '%s'", getName());
    }
}
