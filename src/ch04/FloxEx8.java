package ch04;

import java.util.Scanner;

public class FloxEx8 {
    public static void main(String[] args) {
        System.out.print("주민번호 입력: ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender){
            case '1':
            case '3':
                System.out.println("Man");
                break;
            case '2':
            case '4':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid Resident registration number.");;
        }
    }
}
