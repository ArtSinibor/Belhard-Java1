package by.belhard.j26.homework.homework02;

public class Task3 {
    public static void main(String[] args) {
        int temp = 15;
        if (temp < 10)
            System.out.println("Naden kyrtky");
        else if (temp < 15)
            System.out.println("Naden vetrovky");
        else if (temp < 20)
            System.out.printf("Naden sviter");
        else if (temp < 30)
            System.out.println("Naden maiky");
        else
            System.out.println("Go topless");
    }
}
