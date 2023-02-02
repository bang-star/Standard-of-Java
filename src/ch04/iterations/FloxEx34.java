package ch04.iterations;

import java.util.Scanner;

public class FloxEx34 {
    /**
     * Purpose: 32번를 개선한 메뉴
     */

    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        outer:
        while (true) {
            printMenu();

            System.out.print(">>");
            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("Exit");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("Invalid Menu");
                continue;
            }

            for (; ; ) {
                System.out.print("계산할 값을 입력하세요(계산 종료:0, 전체종료 99) >> ");
                num = scanner.nextInt();

                if (num == 0) {
                    break;
                } else if (num == 99)
                    break outer;

                double result = 0;
                switch (menu) {
                    case 1:
                        result = num * num;
                        break;
                    case 2:
                        result = Math.sqrt(num);
                        break;
                    case 3:
                        result = Math.log(num);
                        break;
                }
                System.out.println("result: " + result);
            }
        }
    }

    private static void printMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Menu]").append("\n");
        sb.append("(1) square").append("\n");
        sb.append("(2) square root").append("\n");
        sb.append("(3) log").append("\n");
        System.out.println(sb);
    }
}
