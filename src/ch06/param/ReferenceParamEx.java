package ch06.param;

public class ReferenceParamEx {

    public static void main(String[] args) {
        Data data = new Data();

        data.x = 10;

        System.out.println("[PrimitiveParamEx - main] X = " + data.x);

        change(data);

        System.out.println("[PrimitiveParamEx - main] X = " + data.x);
    }

    private static void change(Data data) {
        data.x = 1000;
        System.out.println("[PrimitiveParamEx - change] X = " + data.x);
    }
}
