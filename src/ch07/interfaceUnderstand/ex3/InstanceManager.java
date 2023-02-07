package ch07.interfaceUnderstand.ex3;

public class InstanceManager {

    public static I getInstance(){
        return new B();
    }
}
