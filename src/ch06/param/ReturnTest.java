package ch06.param;

public class ReturnTest {

    public static void main(String[] args) {
        ReturnTest returnTest = new ReturnTest();

        int result = returnTest.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        returnTest.add(3, 5, result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
