package ch07.interfaceAdvantages.ex1;

public class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable repairable) {
        if (repairable instanceof Repairable) {
            Unit u = (Unit) repairable;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }

            System.out.println(u + "의 수리가 완료되었습니다.");
        }
    }
}
