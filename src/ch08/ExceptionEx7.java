package ch08;

public class ExceptionEx7 {

    /**
     * ArithmeticException 예외 발생시 생성되는 ArithmeticException 인스턴스를
     * instanceof를 사용하여 확인하고 2개 이상의 catch 문장이 존재할 때
     * try-catch 흐름을 파악할 수 있는 예제
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
            if(ae instanceof ArithmeticException) {
                System.out.println("ArithmeticException is true");
            }

            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
