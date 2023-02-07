package ch07.casting;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fireEngine = null;

        car.drive();
        fireEngine = (FireEngine) car;      // 컴파일 OK. 실행 에러 발생(ClassCastException)
        fireEngine.drive();
        car2 = fireEngine;
        car2.drive();
    }
}
