package ch08;

public class ExceptionEx10 {
    /**
     * Exception클래스들(checked예외)이 발생할 가능성이 있는 경우
     * 컴파일되지 않는 것을 확인할 수 있는 예제
     * @param args
     */

    public static void main(String[] args) {
        throw new Exception();
    }
}
