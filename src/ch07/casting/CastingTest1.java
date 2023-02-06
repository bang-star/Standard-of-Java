package ch07.casting;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fireEngine = new FireEngine();
        FireEngine fireEngine1 = null;

        fireEngine.water();
        car = fireEngine;
        // car.water();     컴파일에러. Car 타입의 참조변수로는 water()를 호출할 수 없다.
        fireEngine1 = (FireEngine) car;     // 조상 -> 자손
        fireEngine1.water();
    }
}
