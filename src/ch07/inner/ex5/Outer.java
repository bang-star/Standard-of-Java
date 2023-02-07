package ch07.inner.ex5;

public class Outer {
    int value = 10;         // Outer.this.value

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println("           value : " + value);              // 30
            System.out.println("      this.value : " + this.value);         // 20
            System.out.println("Outer.this.value : " + Outer.this.value);   // 10
        }
    }
}
