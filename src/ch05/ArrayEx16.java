package ch05;

public class ArrayEx16 {

    /**
     * Purpose: 커맨드라인을 통해 문자열 전달하기
     * How to : java ArrayEx16 abc 123(src 패키지에서 실행해야함)
     */

    public static void main(String[] args) {
        System.out.println("매개변수의 개수 : " + args.length);

        for(int i=0; i<args.length; i++) {
            System.out.printf("args[%d] = [%s]", i, args[i]);
        }
    }
}
