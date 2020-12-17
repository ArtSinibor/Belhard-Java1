package by.belhard.j26.homework.homework10;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("resources/hw10/task1.in"));

            String line = read.readLine();
            read.close();
            String[] splitter = line.split(" ");

            String sbor = Arrays.stream(splitter).mapToInt(Integer::parseInt).map(i->(int)Math.pow(i,3)).
                    mapToObj(String::valueOf).collect(Collectors.joining(" "));

            BufferedWriter writer = new BufferedWriter(new FileWriter("resources/hw10/task1.out"));
            writer.write(sbor);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
