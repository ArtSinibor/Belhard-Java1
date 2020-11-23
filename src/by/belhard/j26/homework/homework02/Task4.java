package by.belhard.j26.homework.homework02;

public class Task4 {
    public static void main(String[] args) {
        int salary1 = 100, salary2 = 200, salary3 = 5000, min, max;
        min = salary1;
        max = salary1;
        if (salary2 < min) min = salary2;
        if (salary3 < min) min = salary3;
        if (salary2 > max) max = salary2;
        if (salary3 > max) max = salary3;
        System.out.println("Raznica max i min zarplat = " + (max-min));
    }
}
