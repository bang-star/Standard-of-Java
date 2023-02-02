package ch04.iterations;

public class FloxEx30 {
    /**
     * Purpose: 숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지 알아내는 문제
     */

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100)
                break;

            i++;
            sum += i;
        }

        System.out.println("i=" + i + ", sum=" + sum);
    }
}
