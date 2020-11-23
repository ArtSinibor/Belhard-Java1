package by.belhard.j26.homework.homework03;

public class Task1 {
    public static void main(String[] args) {
        double[] massiv = {121, 218, 44741, 741, 74, 654, 91, 1, 46, 57};
        double sum = 0, mediana;
        int length = massiv.length;
        System.out.print("Massiv nach:");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + massiv[i]);
            sum += massiv[i];
        }
        System.out.println("\nSumma ravna " + sum);
        System.out.println("Srednee arif " + sum / length);
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    double tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;
                }
            }
        }
        System.out.print("Massiv sort:");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + massiv[i]);
        }

        if (length % 2 == 0) {
            mediana = (massiv[length / 2] + massiv[length / 2 - 1]) / 2;
        } else {
            mediana = massiv[(length-1)/2];
        }
        System.out.println("\nMediana ravna: " + mediana);
    }
}