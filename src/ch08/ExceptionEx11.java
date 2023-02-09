package ch08;

public class ExceptionEx11 {
    /**
     * RuntimeException(unchecked예외)이 발생할 가능성이 있는 경우
     * Exception과 다르게 정상적으로 작동함을 확인할 수 있는 예제
     * @param args
     */
    public static void main(String[] args) {
        throw new RuntimeException();
    }
}
