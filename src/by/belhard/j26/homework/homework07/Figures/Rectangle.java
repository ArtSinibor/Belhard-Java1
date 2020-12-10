package by.belhard.j26.homework.homework07.Figures;

public class Rectangle implements Figure {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double calcSquare() {
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle side A = " + sideA + " side B = " + sideB;
    }
}
