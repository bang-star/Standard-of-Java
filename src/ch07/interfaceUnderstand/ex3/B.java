package ch07.interfaceUnderstand.ex3;

public class B implements I {

    @Override
    public void method() {
        System.out.println("method in B class");
    }

    @Override
    public String toString() {
        return "Class B";
    }
}
