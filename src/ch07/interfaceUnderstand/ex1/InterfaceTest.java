package ch07.interfaceUnderstand.ex1;

import ch07.interfaceUnderstand.ex1.A;
import ch07.interfaceUnderstand.ex1.B;

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
