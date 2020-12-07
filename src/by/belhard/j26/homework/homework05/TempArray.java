package by.belhard.j26.homework.homework05;

import java.util.Arrays;

public class TempArray {

    public double[] TempCalc(double startTemp, double diffTemp, int days) {
        double[] tempArray = new double[days];

        tempArray[0] = startTemp;

        for (int i = 1; i < days; i++) {
            tempArray[i] = tempArray[i - 1] - diffTemp + Math.random() * (2 * diffTemp);
        }

        return tempArray;
    }

}
