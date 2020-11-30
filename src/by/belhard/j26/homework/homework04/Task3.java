package by.belhard.j26.homework.homework04;


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] array01 = {};
        int[] array02 = {1, 2, 3};
        int[] array03 = {-1, -2, -3};
        int[] array04 = {1, -2, 3, -4};

        ArrayCalculator calculator = new ArrayCalculator();

        int[] result = calculator.sumArrays(array01, array02);
        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(array02));
        System.out.println(Arrays.toString(result) + "\n");

        result = calculator.sumArrays(array02, array03);
        System.out.println(Arrays.toString(array02));
        System.out.println(Arrays.toString(array03));
        System.out.println(Arrays.toString(result) + "\n");

        result = calculator.sumArrays(array03, array04);
        System.out.println(Arrays.toString(array03));
        System.out.println(Arrays.toString(array04));
        System.out.println(Arrays.toString(result) + "\n");

        result = calculator.sumArrays(array01, array04);
        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(array04));
        System.out.println(Arrays.toString(result));

        System.out.println("Concat");

        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(array02));
        calculator.concatArrays(array01, array02);
        System.out.println();

        System.out.println(Arrays.toString(array02));
        System.out.println(Arrays.toString(array03));
        calculator.concatArrays(array02, array03);
        System.out.println();

        System.out.println(Arrays.toString(array03));
        System.out.println(Arrays.toString(array04));
        calculator.concatArrays(array03, array04);
        System.out.println();

        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(array04));
        calculator.concatArrays(array01, array04);
        System.out.println();
    }
}
