package ch05;

public class ArrayEx17 {

    /**
     * Purpose: argument 로 전달된 파라미터에 대한 사칙연산 수행
     * How to : java ArrayEx17 operand1 operator operand2 (src 패키지에서 실행해야함)
     */

    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("usage: java ArrayEx17 operand1 operator operand2");
            System.exit(0);
        }

        int operand1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);
        int operand2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (operator){
            case '+' : result = operand1 + operand2; break;
            case '-' : result = operand1 - operand2; break;
            case 'x' : result = operand1 * operand2; break;
            case '/' : result = operand1 / operand2; break;
            default:
                System.out.println(operator +" not supported (ex. +, -, x, /)");
        }

        System.out.println("executed: " + operand1 + operator + operand2 + "=" + result);
    }
}
