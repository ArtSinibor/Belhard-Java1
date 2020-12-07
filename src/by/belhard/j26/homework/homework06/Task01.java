package by.belhard.j26.homework.homework06;


public class Task01 {
    public static void main(String[] args) {

        double a = 15.0, b = 2.5, c = 0;

        Calculator calc = new Calculator();

        System.out.println(calc.Sum(a, b));
        System.out.println(calc.Substruct(a, b));
        System.out.println(calc.Multiply(a, b));
        System.out.println(calc.Divide(a, b));
        System.out.println(calc.Divide(a, c));
    }

}
