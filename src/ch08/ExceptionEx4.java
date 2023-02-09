package ch08;

public class ExceptionEx4 {
    /**
     * try-catch 문에서 예외가 발생한 경우와 발생하지 않은 경우에 대한
     * 프로그램의 흐름을 이해할 수 있는 예제
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(4);
        }catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
