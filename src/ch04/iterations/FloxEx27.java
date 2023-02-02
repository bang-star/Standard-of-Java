package ch04.iterations;

import java.util.Scanner;

public class FloxEx27 {
    /**
     * Purpose: 사용자로부터 숫자를 반복해서 입력받아 총합을 구하자(단, 0을 입력하면 종료된다).
     */

    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;

        System.out.println("합계를 구할 숫자를 입력하세요.(0을 입력하면 종료)");

        while (flag) {
            System.out.print(">>");

            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();

            if (num == 0) {
                flag = false;
            } else {
                sum += num;
            }
        }

        System.out.println("합계: " + sum);
    }
}
