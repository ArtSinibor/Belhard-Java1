package by.belhard.j26.homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    private static final String EXIT_STRING = "exit";

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String input = "";
            System.out.println("Enter: number (+,-,/,*) number\n or exit to exit.");

            while (true) {
                input = reader.readLine();
                if (EXIT_STRING.equals(input))
                    break;

                int num1, num2;
                String operator;

                try {
                    String stringNoSpaces = input.replaceAll("(\\s)", "");
                    operator = stringNoSpaces.replaceAll("(\\d)", "");

                    String[] numbers = stringNoSpaces.split(String.format("[\\%s]", operator));

                    if (operator.isEmpty() || numbers.length != 2)
                        throw new RuntimeException();

                    num1 = Integer.parseInt(numbers[0]);
                    num2 = Integer.parseInt(numbers[1]);

                } catch (RuntimeException e) {
                    System.err.println("Wrong input");
                    continue;
                }

                try {
                    double result = calculation(operator, num1, num2);
                    System.out.println(result);
                } catch (UnsupportedOperationException e) {
                    System.err.println("No math operator: " + e.getMessage());
                }

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static double calculation(String operation, int num1, int num2) {
        double result;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = (double) num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                throw new UnsupportedOperationException(operation);
        }

        return result;
    }
}
