package ch06.recursive;

public class FactorialTest {

    /**
     * Purpose : 간단한 팩토리얼
     */

    public static void main(String[] args) {
        int N = 5;
        int factorial = factorial(N);
        System.out.printf("f(%d) = %d", N, factorial);
    }

    private static int factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }
}
