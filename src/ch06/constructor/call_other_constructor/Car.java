package ch06.constructor.call_other_constructor;

import ch06.constructor.params_constructor.GEARTYPE;

public class Car {
    String color;           // 색상
    GEARTYPE gearType;      // 변속기 종류 - auto(자동), manual(수동)
    int door;               // 문의 개수

    public Car() {
        this("white", GEARTYPE.AUTO, 4);
    }

    public Car(String color, GEARTYPE gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType=" + gearType +
                ", door=" + door +
                '}';
    }
}