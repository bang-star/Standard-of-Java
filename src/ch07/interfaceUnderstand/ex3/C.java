package ch07.interfaceUnderstand.ex3;

public class C implements I {

    @Override
    public void method() {
        System.out.println("method in C class");
    }

    @Override
    public String toString() {
        return "Class C";
    }
}
