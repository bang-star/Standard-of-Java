package ch07.anonymous;

public class AnonymousEx1 {
    Object iv = new Object() { void method() {} };          // 익명 클래스
    static Object cv = new Object() { void method() {} };   // 익명 클래스

    void myMethod() {
        Object iv = new Object() { void method() {} };      // 익명 클래스
    }
}
