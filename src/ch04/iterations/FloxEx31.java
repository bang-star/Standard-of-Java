package ch04.iterations;

public class FloxEx31 {
    /**
     * Purpose: 3의 배수를 제외하고 나머지 숫자를 출력하라.
     */

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue;

            System.out.println(i);
        }
    }
}
