package by.belhard.j26.homework.homework05;

import java.time.LocalTime;

public class Order {

    private static final int DISCOUNT_BORDER_1 = 10;
    private static final int DISCOUNT_BORDER_2 = 50;
    private static final int DISCOUNT_PERCENT_1 = 10;
    private static final int DISCOUNT_PERCENT_2 = 20;

    private String title;
    private int amount;
    private double price;

    public Order(String title, int amount, double price) {
        this.title = title;
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {

        double price = this.price;

        if (amount >= DISCOUNT_BORDER_2)
            price = price * (100 - DISCOUNT_PERCENT_2) / 100;
        else if (amount >= DISCOUNT_BORDER_1)
            price = price * (100 - DISCOUNT_PERCENT_1) / 100;

        return price;
    }

    @Override
    public String toString() {
        return "Order{" + "title='" + title +
                ",\n amount=" + amount + ", price=" + price + '}';
    }

}
