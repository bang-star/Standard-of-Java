package ch05;

public class ArrayEx14 {

    /**
     * Purpose: String 클래스 주요 메소드
     */

    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "):" + ch);
        }

        // String to char[]
        char[] chArr = src.toCharArray();

        System.out.println(chArr);
    }
}
