package ch07.binding;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child2 c = new Child2();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}
