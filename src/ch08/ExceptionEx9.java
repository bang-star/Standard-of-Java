package ch08;

public class ExceptionEx9 {
    /**
     * Exception 클래스를 이용하여 고의로 에러를 발생시키는 예제
     * @param args
     */
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰다.");
            throw e;        // 예외를 발생시킴
            // throw new e;
        }catch (Exception e) {
            System.out.println("[예외 메시지]: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
