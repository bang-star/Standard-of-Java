package ch04.iterations;

import java.util.Scanner;

public class FloxEx17 {
    public static void main(String[] args) {
        System.out.print("*을 출력할 라인 수: >");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
