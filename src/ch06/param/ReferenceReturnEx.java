package ch06.param;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.x = 10;

        Data data2 = copy(data1);
        System.out.printf("data-x: %d%n", data1.x);
        System.out.printf("data-x: %d%n", data2.x);
    }

    private static Data copy(Data data1) {
        Data tmp = new Data();
        tmp.x = data1.x;
        return tmp;
    }
}
