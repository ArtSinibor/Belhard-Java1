package by.belhard.j26.homework.homework02;

public class Task5 {
    public static void main(String[] args) {
        int a = -10, n = 4, pow = 1;
        for (int i = 0; i < n; i++){
            pow = pow * a;
        }
        System.out.println("Chislo " + a + " v stepeni " + n + " ravno " + pow);
    }
}
