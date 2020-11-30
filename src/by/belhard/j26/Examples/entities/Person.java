package by.belhard.j26.Examples.entities;

public class Person {

    public String name;
    public int age;
    public Country country;
    public Sex sex;

    public Person() {
    }

    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat(String dish) {
        System.out.println(name + " is eating " + dish);
    }

    public int growOld() {
        return ++age;
    }
}
