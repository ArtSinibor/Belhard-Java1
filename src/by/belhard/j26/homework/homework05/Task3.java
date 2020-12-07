package by.belhard.j26.homework.homework05;

public class Task3 {
    public static void main(String[] args) {

        Task3 task = new Task3();

        Order[] orders = {
                new Order("macarons", 3, 1000),
                new Order("milk", 25, 100),
                new Order("ice cream", 100, 500)
        };

        for (Order o : orders)
            System.out.println(o);

        System.out.println("Total cost: " + task.calcSum(orders));
    }

    private double calcSum(Order[] orders) {

        double sum = 0;

        for (Order o : orders) sum += o.getAmount() * o.getPrice();

        return sum;
    }

}
