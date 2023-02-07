package ch07.interfaceInheritance;

public class Fighter extends Unit implements Fightable {

    public Fighter(int currentHP, int x, int y) {
        super(currentHP, x, y);
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("attack " + unit);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("move " + x + ", " + y);
    }
}
