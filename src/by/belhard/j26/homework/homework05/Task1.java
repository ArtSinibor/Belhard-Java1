package by.belhard.j26.homework.homework05;

public class Task1 {
    public static void main(String[] args) {
        TempArray section1 = new TempArray();

        double[] res = section1.TempCalc(21, 11, 28);
        for (double d : res) {
            System.out.printf("%7.3f ", d);
        }
    }
}
