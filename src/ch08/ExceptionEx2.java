package ch08;

public class ExceptionEx2 {
    /**
     * ArithmeticException 예외 발생으로 인한 비정상적 종료 예
     * @param args
     */
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10);
            System.out.println(result);
        }
    }
}
