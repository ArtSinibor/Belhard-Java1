package by.belhard.j26.homework.homework09;

import java.util.Map;
import java.util.TreeMap;

public class PurchasesList {

    public void addOrder(TreeMap<String, TreeMap<String, Integer>> sosedi, String name, String productName, int count) {
        if (!sosedi.containsKey(name))
            sosedi.put(name, new TreeMap<String, Integer>());

        TreeMap<String, Integer> temp = sosedi.get(name);
        if (!temp.containsKey(productName))
            temp.put(productName, 0);

        Integer oldCount = temp.get(productName);
        temp.put(productName, oldCount + count);
    }

    public void showOrder(TreeMap<String, TreeMap<String, Integer>> persons) {

        //Вывод списка покупок - не получается - спросить на занятии?


        //Вывод покупок для каждого из списка
        for (Map.Entry<String, TreeMap<String, Integer>> entry : persons.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();

            System.out.println(key + ":");

            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();

                System.out.println(keyProduct + " " + valueProduct);
            }
        }
    }

}