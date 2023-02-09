package ch08.finallyTest;

public class FinallyTest2 {
    /**
     * try-catch문에서 예외 발생여부와 관계없이
     * 필수적으로 호출되어야하는 코드를 finally를 통해 해결한 예제
     * @param args
     */

    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {
        System.out.println("delete Temp Files");
    }

    private static void copyFiles() {
        System.out.println("Copy Files");
    }

    private static void startInstall() {
        System.out.println("Start Install");
    }
}
