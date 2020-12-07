package by.belhard.j26.homework.homework05;

public class Player {
    private int x, y;
    private String playerName;
    private double distance;

    public Player(String playerName) {
        this(playerName, 0, 0);
    }

    public Player(String playerName, int x, int y) {
        this.playerName = playerName;
        this.x = x;
        this.y = y;
        this.distance = 0;
    }

    public void move(int x, int y) {
        if (this.x == x && this.y == y) return;

        this.distance += Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return playerName + " - (" + x + "," + y + "), distance: " + distance;
    }
}
