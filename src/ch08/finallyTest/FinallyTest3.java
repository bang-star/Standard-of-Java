package ch08.finallyTest;

public class FinallyTest3 {
    /**
     * try-catch-finally 구조에서 예외가 발생하지 않고
     * return이 실행될때라도 return 실행 전 finally를
     * 먼저 실행함을 확일할 수 있는 예제
     * @param args
     */
    public static void main(String[] args) {
        // method1()은 static 메서드이므로 인스턴스 생성없이 직접 호출이 가능하다.
        FinallyTest3.method1();
        System.out.println(" FinallyTest3.method1() 작업 완료 후 main 메서드로 복귀 완료.");
    }

    private static void method1() {
        try {
            System.out.println("call method1");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1 finally");
        }
    }

}
