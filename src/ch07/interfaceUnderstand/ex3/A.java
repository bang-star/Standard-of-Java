package ch07.interfaceUnderstand.ex3;

public class A {
    public void methodA() {
        I i = InstanceManager.getInstance();
        i.method();
        System.out.println(i.toString());
    }
}
