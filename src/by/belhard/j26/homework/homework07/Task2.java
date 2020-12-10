package by.belhard.j26.homework.homework07;

import by.belhard.j26.homework.homework07.Pets.*;

public class Task2 {

    public static void main(String[] args) {

        Pets dog =new Dog("Laika");
        Pets cat = new Cat("Tiger");
        Pets fish = new Fish("Bubble");

        Human human1 = new Human("Alex", dog);
        Human human2 = new Human("Alena", cat);
        Human human3 = new Human("Noname");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println();

        human1.play();
        human2.play();
        human3.play();
        System.out.println();

        human1.play(human2.getPet());
        human3.play(fish);

        fish.play();
    }
}
