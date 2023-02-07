package ch07.defaultMethod;

public interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInstance");
    }

    default void method2() {
        System.out.println("method1() in MyInstance");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInstance");
    }
}
