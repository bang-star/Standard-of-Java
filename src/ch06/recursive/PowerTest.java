package ch06.recursive;

public class PowerTest {
    /**
     * Purpose: X^1 부터 X^n까지의 합을 구하기
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }

        System.out.println(result);
    }

    public static long power(int x, int n) {
        if (n == 1) return x;
        return x * power(x, n - 1);
    }
}
