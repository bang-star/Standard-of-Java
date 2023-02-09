package ch08.finallyTest;

public class FinallyTest {
    /**
     * finally가 필요한 이유를 설명할 수 있는 예제로
     * try-catch 구조에서 필수적으로 처리되어야하는 코드를
     * try-catch 구조에서 해결한 코드
     * @param args
     */
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
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
