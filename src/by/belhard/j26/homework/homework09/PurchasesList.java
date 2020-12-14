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

        //Вывод покупок для каждого из списка
        for (Map.Entry<String, TreeMap<String, Integer>> entry : persons.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();

            System.out.println("\n" + key + ":");

            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();

                System.out.println(keyProduct + " " + valueProduct);
            }
        }

        //Вывод списка покупок - слишком вывернуто - спросить на занятии?
        //              ПОЛНАЯ ЕРУНДА?
        System.out.println("\n");
        TreeMap<String, TreeMap<String, Integer>> personsClone = new TreeMap<String, TreeMap<String, Integer>>(persons);
        for (Map.Entry<String, TreeMap<String, Integer>> entry : personsClone.entrySet()) {
            TreeMap<String, Integer> value = entry.getValue();
            int finalProductValue = 0;
            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String finalKeyProduct = product.getKey();

                for (Map.Entry<String, TreeMap<String, Integer>> entryClone : personsClone.entrySet()) {
                    TreeMap<String, Integer> valueClone = entryClone.getValue();
                    for (Map.Entry<String, Integer> productClone : valueClone.entrySet()) {
                        if (finalKeyProduct.equals(productClone.getKey())) {
                            finalProductValue += productClone.getValue();
                            valueClone.remove(productClone.getKey());//удаляет из обоих листов - почему?
                        }

                    }
                }

                System.out.println(product.getKey() + ": " + finalProductValue);
            }
        }


    }

}
