package by.belhard.j26.homework.homework10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter number of lines:");
            int num_lines = Integer.parseInt(reader.readLine());

            List<Product> productsInput = new ArrayList<>();

            System.out.println("Enter products:\n Title Price(double) Quantity(int)");
            for (int i = 0; i < num_lines; i++) {
                String[] splitter = reader.readLine().split(" ");
                String title = splitter[0];
                double price;
                int quantity;

                try {
                    price = Double.parseDouble(splitter[1]);
                    quantity = Integer.parseInt(splitter[2]);
                    if (quantity <= 0 || price <= 0)
                        throw new RuntimeException();
                } catch (RuntimeException e) {
                    System.err.println("Invalid input");
                    i--;
                    continue;
                }

                productsInput.add(new Product(title, price, quantity));

            }

            double summa = productsInput.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
            System.out.printf("Total price: %2f\n", summa);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
