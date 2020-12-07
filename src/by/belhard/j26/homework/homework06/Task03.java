package by.belhard.j26.homework.homework06;

public class Task03 {
    public static void main(String[] args) {

        StringStorage mass1 = new StringStorage("fehy", "eivaz", "tyrisaz", "gebo");

        System.out.println(mass1);

        mass1.changeOrder(0,10);
        mass1.changeOrder(2,3);
        System.out.println(mass1);

    }
}
