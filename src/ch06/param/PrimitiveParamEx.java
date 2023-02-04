package ch06.param;

public class PrimitiveParamEx {

    public static void main(String[] args) {
        Data data = new Data();

        data.x = 10;

        System.out.println("[PrimitiveParamEx - main] X = " + data.x);

        change(data.x);

        System.out.println("[PrimitiveParamEx - main] X = " + data.x);
    }

    private static void change(int x) {
        x = 1000;
        System.out.println("[PrimitiveParamEx - change] X = " + x);
    }
}
