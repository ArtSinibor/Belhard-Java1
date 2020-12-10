package by.belhard.j26.homework.homework07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<String> stroki = Arrays.asList(
                "Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota", "Kappa", "Lambda", "Mu",
                "Nu", "Xi", "Omnicron", "Pi", "Rho", "Sigma", "Tau", "Upsilon", "Phi", "Chi", "Psi", "Omega"
        );

        List<String> strchar1 = getStringContainsCharIgnoreRegister(stroki, 'p');
        System.out.println(strchar1 + "\n");

        List<String> strchar2 = getStringContainsCharWithRegister(stroki, 'p');
        System.out.println(strchar2 + "\n");


    }

    private static List<String> getStringContainsCharIgnoreRegister(List<String> strings, char c) {

        List<String> res = new ArrayList<>();

        for (String s : strings) {
            if (s.toLowerCase().contains("" + c))
                res.add(s);
        }

        return res;
    }

    private static List<String> getStringContainsCharWithRegister(List<String> strings, char c) {

        List<String> res = new ArrayList<>();

        for (String s : strings) {
            if (s.contains("" + c))
                res.add(s);
        }

        return res;
    }
}
