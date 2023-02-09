package ch08;

public class ExceptionEx12 {
    /**
     * 메서드에 예외 선언을 통해 연관된 메서드에 모두 예외 클래스를
     * 예외를 처리하기 전까지 명시적으로 사용해야함을 확인할 수 있는 예제
     */

    public static void main(String[] args) throws Exception {
        method1();      // 동일 클래스내의 static 멤버이므로 객체생성없이 호출 가능
    }

    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception{
        throw new Exception();
    }
}
