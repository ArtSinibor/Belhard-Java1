package by.belhard.j26.homework.homework06;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Table of multiply from 1 to:");
        int size = scan.nextInt() + 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 && j == 0)
                    System.out.print("     ");
                else if (i == 0)
                    System.out.printf("%5d", j);
                else if (j == 0)
                    System.out.printf("%5d", i);
                else
                    System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}

