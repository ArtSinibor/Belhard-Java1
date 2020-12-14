package by.belhard.j26.homework.homework09;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        TreeMap<String, TreeMap<String, Integer>> list1 = new TreeMap<String, TreeMap<String, Integer>>();
        PurchasesList order = new PurchasesList();

        order.addOrder(list1, "Tatiana", "Milk", 5);
        order.addOrder(list1, "Tatiana", "Bread", 3);
        order.addOrder(list1, "Vasiliy", "Butter", 1);
        order.addOrder(list1, "Vasiliy", "Butter", 3);
        order.addOrder(list1, "Arseniy", "Milk", 3);

        order.showOrder(list1);

    }
}
