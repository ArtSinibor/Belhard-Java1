package by.belhard.j26.homework.homework04.arraycalc;

public class ArrayCalculator {

    public int[] SumArrays(int[] array1, int[] array2) {

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
}
