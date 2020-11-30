package by.belhard.j26.homework.homework04;

public class ArrayCalculator {

    public int[] sumArrays(int[] array1, int[] array2) {

        int maxArrayLenght = Math.max(array1.length, array2.length);
        int minArrayLenght = Math.min(array1.length, array2.length);

        int[] sumArray = new int[maxArrayLenght];

        for (int i = 0; i < minArrayLenght; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        for (int i = minArrayLenght; i < maxArrayLenght; i++) {
            if (maxArrayLenght == array1.length) sumArray[i] = array1[i];
            else sumArray[i] = array2[i];
        }

        return sumArray;
    }

    public void concatArrays(int[] array1, int[] array2) {

        if (array1.length < array2.length) {
            for (int i = 0; i < array1.length; i++)
                System.out.print(array2[i] + " " + array1[i] + " ");
            for (int i = array1.length; i < array2.length; i++)
                System.out.print(array2[i] + " ");
        } else {
            for (int i = 0; i < array2.length; i++)
                System.out.print(array1[i] + " " + array2[i] + " ");
            for (int i = array2.length; i < array1.length; i++)
                System.out.print(array1[i] + " ");
        }
        System.out.println();
    }
}
