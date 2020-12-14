package by.belhard.j26.homework.homework09;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        while (set.size() < 10) {
            set.add(getRandomInt());
        }

        System.out.println("Set:" + set);

        int border = getRandomInt();
        System.out.println("Border: " + border);

        removeLessThenBorder(set, border);
        System.out.println("New set: " + set);
    }

    private static int getRandomInt() {
        return -100 + (int) (Math.random() * 200);
    }

    private static void removeLessThenBorder(HashSet<Integer> set, int border) {
        set.removeIf(integer -> integer < border);
    }
}
