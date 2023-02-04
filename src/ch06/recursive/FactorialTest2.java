package ch06.recursive;

public class FactorialTest2 {

    /**
     * Purpose : StackOverflow를 고려한 팩토리얼
     */

    public static void main(String[] args) {
        int N = 21;
        long result = 0;

        for (int i = 1; i <= N; i++) {
            result = factorial(i);

            if(result == -1){
                System.out.printf("유효하지 않은 값입니다.(0 < n <= 20): %d%n", N);
                break;
            }

            System.out.printf("f(%2d) = %20d%n", i, result);
        }
    }

    private static int factorial(int n) {
        if (n <= 0 || n > 20) return -1;
        else if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
}
