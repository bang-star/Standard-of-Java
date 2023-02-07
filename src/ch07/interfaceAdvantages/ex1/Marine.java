package ch07.interfaceAdvantages.ex1;

public class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Marine";
    }
}
