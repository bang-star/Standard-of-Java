package ch07.interfaceInheritance;

public class Unit {
    private int currentHP;
    private int x;
    private int y;

    public Unit(int currentHP, int x, int y) {
        this.currentHP = currentHP;
        this.x = x;
        this.y = y;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
