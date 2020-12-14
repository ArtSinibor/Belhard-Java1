package by.belhard.j26.homework.homework09;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            set.add(-100 + (int) (Math.random() * 200));
        }

        System.out.println("Set:" + set);

        int border = -100 + (int) (Math.random() * 200);
        System.out.println("Border: " + border);

        removeLessThenBorder(set, border);
        System.out.println("New set: " + set);
    }

    private static HashSet<Integer> removeLessThenBorder(HashSet<Integer> set, int border) {
        set.removeIf(integer -> integer < border);
        return set;
    }
}
