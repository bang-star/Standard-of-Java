package ch06.callstack;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("[CallStackTest2 - main] is started.");
        callFirstMethod();
        System.out.println("[CallStackTest2 - main] is finished.");
    }

    private static void callFirstMethod() {
        System.out.println("[CallStackTest2 - callFirstMethod] is started.");
        callSecondMethod();
        System.out.println("[CallStackTest2 - callFirstMethod] is finished.");
    }

    private static void callSecondMethod() {
        System.out.println("[CallStackTest2 - callSecondMethod] is started.");
        System.out.println("[CallStackTest2 - callSecondMethod] is finished.");
    }
}
