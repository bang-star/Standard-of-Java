package ch04.conditionals;

import java.util.Scanner;

public class FloxEx5 {
    public static void main(String[] args) {
        char grade = ' ';
        char opt = '0';

        System.out.print("점수를 입력하세요. >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int score = Integer.parseInt(tmp);

        System.out.printf("점수 : %d.\n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("학점은 %c%c 입니다.%n", grade, opt);
    }
}
