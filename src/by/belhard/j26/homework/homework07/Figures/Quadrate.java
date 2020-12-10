package by.belhard.j26.homework.homework07.Figures;

public class Quadrate extends Rectangle {
    public Quadrate(double side) {
        super(side, side);
    }

    @Override
    public double calcSquare() {
        return super.calcSquare();
    }

    @Override
    public double calcPerimeter() {
        return super.calcPerimeter();
    }

    @Override
    public String toString() {
        return "Qadrate side = " + getSideA();
    }
}
