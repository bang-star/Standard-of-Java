package ch06.constructor.params_constructor;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "White";
        c1.gearType = GEARTYPE.AUTO;
        c1.door = 4;

        Car c2 = new Car("Black", GEARTYPE.MANUAL, 2);

        System.out.println(c1);
        System.out.println(c2);
    }
}
