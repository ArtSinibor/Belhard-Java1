package by.belhard.j26.homework.homework03;

// [10; 19], [30; 39], [50; 59], [70; 79], [90; 99]

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 7 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0 | i % 7 == 0) & !(i % 5 == 0 & i % 7 == 0))     //i % 5 == 0 ^ i % 7 == 0
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if ((i/10)%2 != 0) {      // ((i >= 10 & i < 20) | (i >= 30 & i < 40) | (i >= 50 & i < 60) | (i >= 70 & i < 80) | (i >= 90 & i < 100))
                if ((i % 5 == 0 | i % 7 == 0) & !(i % 5 == 0 & i % 7 == 0))
                    System.out.print(i + " ");
            }
        }

    }
}
