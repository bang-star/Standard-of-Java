package ch06.method;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.add(200L, 200L));
        System.out.println(Math.subtract(200L, 200L));
        System.out.println(Math.multiply(200L, 200L));
        System.out.println(Math.divide(200.0, 200.0));

        Math math = new Math(200L, 100L);
        System.out.println(math.add());
        System.out.println(math.subtract());
        System.out.println(math.multiply());
        System.out.println(math.divide());
    }
}
