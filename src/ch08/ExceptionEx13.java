package ch08;

public class ExceptionEx13 {
    /**
     * 내부에서 예외처리하여 메서드를 호출한 측에서는
     * 내부적으로 어떠한 에러가 발생했는지 알 수 없음을 확인할 수 있는 예제
     */

    public static void main(String[] args) {
        method1();      // 동일 클래스내의 static 멤버이므로 객체생성없이 호출 가능
    }

    private static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외처리 완료.");
            e.printStackTrace();
        }
    }
}
