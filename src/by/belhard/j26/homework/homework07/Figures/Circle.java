package by.belhard.j26.homework.homework07.Figures;


public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle radius= " + radius;
    }
}
