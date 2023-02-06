package ch07.binding;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}
