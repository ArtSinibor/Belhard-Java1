package by.belhard.j26.homework.homework07;

import by.belhard.j26.homework.homework07.Figures.*;

public class Task3 {
    public static void main(String[] args) {

        Figure circle = new Circle(20);
        Figure rectangle = new Rectangle(10, 20);
        Figure qadrate = new Quadrate(10);

        System.out.println(circle);
        System.out.println("Area: " + CalculationUtils.calcSquare(circle));
        System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(circle) + "\n");

        System.out.println(rectangle);
        System.out.println("Area: " + CalculationUtils.calcSquare(rectangle));
        System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(rectangle) + "\n");

        System.out.println(qadrate);
        System.out.println("Area: " + CalculationUtils.calcSquare(qadrate));
        System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(qadrate) + "\n");
    }
}
