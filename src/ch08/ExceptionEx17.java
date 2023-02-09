package ch08;

public class ExceptionEx17 {

    /**
     * 예외 되던지기로 이중에서 예외처리를 진행하는 예제
     * @param args
     */
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        }catch (Exception e) {
            System.out.println("method1에서 예외가 처리되었습니다.");
            throw e;
        }
    }
}
