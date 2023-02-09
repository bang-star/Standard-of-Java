package ch08;

public class ExceptionEx3 {
    /**
     * try-catch문을 통해 ArithmeticException 예외로 인한 비정상적 종료 문제 해결
     * @param args
     */
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
