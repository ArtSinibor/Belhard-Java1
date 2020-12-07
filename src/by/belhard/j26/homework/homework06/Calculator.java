package by.belhard.j26.homework.homework06;

public class Calculator {

    public double Sum(double a, double b) {
        a += b;
        return a;
    }

    public double Substruct(double a, double b) {
        a -= b;
        return a;
    }

    public double Multiply(double a, double b) {
        a *= b;
        return a;
    }

    public double Divide(double a, double b) {
/*        if (b == 0) {
            System.out.println("Can't divide to 0!");
        } else*/ a /= b;
        return a;
    }

}
