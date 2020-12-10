package by.belhard.j26.homework.homework07;

import by.belhard.j26.homework.homework07.Person.Person;

import java.util.Arrays;
import java.util.List;

public class Task4 {

    private static List<Person> personList = Arrays.asList(
            new Person("Alex"),
            new Person("Bero"),
            new Person("Cali"),
            new Person("Dolly"),
            new Person("Elvis")
    );

    public static void main(String[] args) {

        Person person = getPersonByName("Cali");
        System.out.println(person == null ? "null" : person.toString());
        System.out.println();

        person = getPersonByName("Goblin");
        System.out.println(person == null ? "null" : person.toString());
        System.out.println();

        person = getPersonByName("Bero");
        System.out.println(person == null ? "null" : person.toString());
        System.out.println();

        System.out.println(personList);
    }

    private static Person getPersonByName(String name) {

        for (Person person : personList)
            if (person.getName().equals(name))
                return person;

        return null;
    }
}
