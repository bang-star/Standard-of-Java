package ch06.constructor.call_other_constructor;

import ch06.constructor.params_constructor.Car;
import ch06.constructor.params_constructor.GEARTYPE;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Black", GEARTYPE.MANUAL, 2);

        System.out.println(c1);
        System.out.println(c2);
    }
}
