package ch06.math;

public class MathTest {
    public static void main(String[] args) {
        Math math = new Math();
        long result1 = math.add(5L, 3L);
        long result2 = math.substract(5L, 3L);
        long result3 = math.multiply(5L, 3L);
        double result4 = math.divide(5L, 3L);

        System.out.println("add(3L, 5L) = " + result1);
        System.out.println("substract(3L, 5L) = " + result2);
        System.out.println("multiply(3L, 5L) = " + result3);
        System.out.println("divide(3L, 5L) = " + result4);
    }
}
