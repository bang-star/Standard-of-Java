package ch08;

public class ExceptionEx8 {
    /**
     * 예외 발생 시 예외에 대한 정보를 확인하기 위해 사용할 수 있는 메소드 중 하나인
     * printStackTrace를 사용하여 예외발생 당시의 호출스택에 대한 정보를 출력하는 예제
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("[예외 메시지]: " + ae.getMessage());
        }
        System.out.println(6);
    }
}
