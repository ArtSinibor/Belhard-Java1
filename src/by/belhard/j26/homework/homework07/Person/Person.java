package by.belhard.j26.homework.homework07.Person;

public class Person {

    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person name: " + name + " " + Integer.toHexString(this.hashCode()) ;
    }
}
