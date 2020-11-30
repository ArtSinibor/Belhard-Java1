package by.belhard.j26.homework.homework03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Vvedite n");
        int n = inp.nextInt();
        int[][] tria1 = new int[n][n], tria2  = new int[n][n];
        System.out.println("Vvedite pervoe chislo ");
        int startNum = inp.nextInt(), nextNum;
        nextNum = startNum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tria1[i][j] = nextNum;
                nextNum *= 2;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-6d", tria1[i][j]);
            }
            System.out.println("\n");
        }
        nextNum = startNum;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - 1 - i; j--) {
                tria2[i][j] = nextNum;
                nextNum *= 2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-10d", tria2[i][j]);
            }
            System.out.println("\n");
        }
    }
}
