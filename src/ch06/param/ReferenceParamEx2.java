package ch06.param;

public class ReferenceParamEx2 {

    public static void main(String[] args) {
        int[] x = new int[10];

        System.out.println("[ReferenceParamEx2 - main] X = " + x[0]);

        change(x);

        System.out.println("[ReferenceParamEx2 - main] X = " + x[0]);
    }

    private static void change(int[] x) {
        x[0] = 1000;
        System.out.println("[ReferenceParamEx2 - change] X = " + x[0]);
    }
}
