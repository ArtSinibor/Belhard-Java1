package by.belhard.j26.homework.homework05;

public class Task2 {
    public static void main(String[] args) {
        Player plr1 = new Player("Newbie", 0, 0);
        Player plr2 = new Player("Profi");

        System.out.println(plr1);
        plr1.move(3,7);
        System.out.println(plr1);
        plr1.move(11, -3);
        System.out.println(plr1);
        plr1.move(0, 3);
        System.out.println(plr1);

        System.out.println(plr2);
        plr2.move(6, 6);
        System.out.println(plr2);
    }
}
