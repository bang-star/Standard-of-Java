package ch07.interfaceAdvantages.ex1;

public class Tank extends AirUnit implements Repairable{

    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "TANK";
    }
}
