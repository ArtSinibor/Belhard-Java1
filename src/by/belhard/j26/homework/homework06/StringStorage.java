package by.belhard.j26.homework.homework06;

import java.util.Arrays;

public class StringStorage {

    private final String[] mass;

    public StringStorage(String... mass) {
        this.mass = mass;
    }

    public void changeOrder(int place1, int place2) {
        if (place1 < 0 || place1 >= mass.length) {
            System.out.println("Invalid first index");
        } else if (place2 < 0 || place2 >= mass.length) {
            System.out.println("Invalid second index");
        } else {
            String temp = mass[place1];
            mass[place1] = mass[place2];
            mass[place2] = temp;
        }
    }

    public String[] getMass() {
        return mass;
    }

    @Override
    public String toString(){
        return Arrays.toString(mass);
    }
}
