package ch04.iterations;

public class FloxEx26 {
    /**
     * Purpose: 1부터 시작하여 누적합계가 100을 넘지 않는 제일 큰 수 찾기
     */

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d %n", i, sum);
        }
    }
}
