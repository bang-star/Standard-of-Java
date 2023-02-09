package ch08.finallyTest;

public class FinallyTest {
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
