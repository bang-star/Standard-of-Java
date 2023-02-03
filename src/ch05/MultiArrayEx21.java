package ch05;

import java.util.Scanner;

public class MultiArrayEx21 {

    /**
     * Purpose: 빙고
     */

    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, callNum = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열의 모든 요소 초기화
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        // 배열에 저장된 값을 뒤섞는다.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료: 0) > ", SIZE * SIZE);
            callNum = scanner.nextInt();

            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == callNum) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        }while (callNum != 0);
    }
}
