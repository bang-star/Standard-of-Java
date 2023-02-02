package ch04.iterations;

import java.util.Scanner;

public class FloxEx28 {
    /**
     * Purpose: 랜덤 수 찾기
     */

    public static void main(String[] args) {
        int input = 0, answer = 0;

        Scanner scanner = new Scanner(System.in);
        answer = (int)(Math.random() * 100) + 1;

        do {
            System.out.print("1과 100 사이의 정수 입력:");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("더 작은 수로 도전하세요.");
            } else if (input < answer){
                System.out.println("더 큰 수로 도전하세요.");
            }else {
                System.out.println("정답입니다.");
            }
        }while (input != answer);
    }
}
