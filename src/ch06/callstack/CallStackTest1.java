package ch06.callstack;

public class CallStackTest1 {
    public static void main(String[] args) {
        callFirstMethod();
    }

    private static void callFirstMethod() {
        callSecondMethod();
    }

    private static void callSecondMethod() {
        System.out.println("Called callSecondMethod");
    }
}
