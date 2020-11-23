package by.belhard.j26.homework.homework02;

public class Task6 {
    public static void main(String[] args) {
        double startSum = 100, proc = 5;
        int years = 5;
        double endSum = startSum * Math.pow((1 + proc / 100), years);
        System.out.println("Summa vklada cherez " + years + " let ravna " + endSum);
        endSum = endSum - 0.01 * startSum * years;
        System.out.println("Summa vklada cherez " + years + " let s nalogom ravna " + endSum);

        endSum = startSum;
        for (int i = 0; i < years; i++) {
            endSum = endSum + endSum * proc / 100 - startSum * 0.01;
        }
        System.out.println(endSum);
    }
}
