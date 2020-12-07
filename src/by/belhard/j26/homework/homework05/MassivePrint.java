package by.belhard.j26.homework.homework05;

public class MassivePrint {

    public MassivePrint(String[] mass, int leng) {

        for (String o : mass) if (o.length() >= leng) System.out.println(o);

    }

}
