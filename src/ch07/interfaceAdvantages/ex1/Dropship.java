package ch07.interfaceAdvantages.ex1;

public class Dropship extends AirUnit implements Repairable {

    Dropship() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}
