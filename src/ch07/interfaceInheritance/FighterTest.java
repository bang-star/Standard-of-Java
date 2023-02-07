package ch07.interfaceInheritance;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter(100, 0, 0);

        if (fighter instanceof Unit) {
            System.out.println("fighter는 Unit 클래스의 자손입니다.");
        }

        if (fighter instanceof Fightable) {
            System.out.println("fighter는 Fightable인터페이스의 구현체이다.");
        }

        if (fighter instanceof Movable) {
            System.out.println("fighter는 Movable 구현체이다.");
        }

        if(fighter instanceof Attackable) {
            System.out.println("fighter는 Attackable 구현체이다.");
        }

        if (fighter instanceof Object) {
            System.out.println("fighter는 Object 클래스의 자손입니다.");
        }
    }
}
