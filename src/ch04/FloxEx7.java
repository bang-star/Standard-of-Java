package ch04;

import java.util.Scanner;

public class FloxEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택해주세요. >");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) + 1;

        System.out.println("[You] "+user+", [Com]"+com);

        switch(user-com) {
            case 2: case -1:
                System.out.println("You Lose");
                break;
            case 1: case -2:
                System.out.println("You Win");
                break;
            case 0:
                System.out.println("Tie");
        }
    }
}
