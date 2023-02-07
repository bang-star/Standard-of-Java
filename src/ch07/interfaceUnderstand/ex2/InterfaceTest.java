package ch07.interfaceUnderstand.ex2;

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}
