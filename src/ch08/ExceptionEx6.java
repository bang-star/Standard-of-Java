package ch08;

public class ExceptionEx6 {
    /**
     * ArithmeticException의 부모 클래스 Exception 클래스에 대해서도
     * 정상적으로 예외처리가 되는지 점검하는 예제
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
