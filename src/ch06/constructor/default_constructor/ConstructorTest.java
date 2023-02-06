package ch06.constructor.default_constructor;

public class ConstructorTest {

    public static void main(String[] args) {
        Data1 data1 = new Data1();
        // Data2 data2 = new Data2(); compile error 발생
        Data2 data2 = new Data2(5);
    }
}