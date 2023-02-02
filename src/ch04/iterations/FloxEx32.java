package ch04.iterations;

import java.util.Scanner;

public class FloxEx32 {
    /**
     * Purpose: 메뉴를 보여주고 선택하는 로직
     */

    public static void main(String[] args) {
        int menu = 0;

        Scanner scanner = new Scanner(System.in);
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
            System.out.println("Select Menu: " + menu);
            System.out.println();
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
