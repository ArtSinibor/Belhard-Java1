package by.belhard.j26.homework.homework10.Banka;

public class Account {

    private final String name;
    private int money;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return name + " " + money;
    }
}
