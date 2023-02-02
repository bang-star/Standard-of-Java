package ch04.iterations;

public class FloxEx29 {
    /**
     * Purpose: 숫자 중에 3의 배수(3, 6, 9)가 포함되어 있으면 포함된 개수만큼 박수를 치는 3,6,9 게임
     */

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do {
                // tmp % 10이 3의 배수인지 확인(0제외)
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);

            System.out.println();
        }
    }
}
