package ch05;

public class ArrayEx15 {

    /**
     * Purpose: 문자열을 모르스(morse)부호로 변환
     */

    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.."
        };

        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source:" + source);
        System.out.println("morse:" + result);
    }
}
