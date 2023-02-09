package ch08;

public class ExceptionEx1 {

    /**
     * 단순한 try-catch문의 사용 예
     * @param args
     */

    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
           // try {} catch (Exception e) {}   // 에러. 변수 e가 중복 선언되었다.
        }

        try {

        } catch (Exception e) {

        }
    }
}
