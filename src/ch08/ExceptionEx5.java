package ch08;

public class ExceptionEx5 {
    /**
     * try-catch 문에서 예외가 발생한 경우 프로그램의 흐름이
     * 언제부터 예외처리 부분(catch)로 전환되는지 확인할 수 있는 예제
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
