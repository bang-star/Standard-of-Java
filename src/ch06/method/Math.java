package ch06.method;

public class Math {
    private final long a;
    private final long b;

    public Math(long a, long b){
        this.a = a;
        this.b = b;
    }

    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요 없다.
    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    // 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) { return a + b; }
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
}
