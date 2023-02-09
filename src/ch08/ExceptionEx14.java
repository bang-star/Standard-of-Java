package ch08;

public class ExceptionEx14 {
    /**
     * 예외가 발생한 메서드에서 예외를 처리하지 않고 호출한 메서드로
     * 예외처리를 위임하여 호출한 라인에서 예외가 발생시켜 처리하도록 하는 예제
     */

    public static void main(String[] args) {
        try {
            method1();      // 동일 클래스내의 static 멤버이므로 객체생성없이 호출 가능
        } catch (Exception e) {
            System.out.println("main에서 예외처리 완료.");
            e.printStackTrace();
        }
    }

    private static void method1() throws Exception {
        throw new Exception();
    }
}
