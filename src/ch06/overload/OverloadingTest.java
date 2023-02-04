package ch06.overload;

public class OverloadingTest {

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println("math.add(3, 3) - " + math.add(3, 3));
        System.out.println("math.add(3L, 3) - " + math.add(3L, 3));
        System.out.println("math.add(3, 3L) - " + math.add(3, 3L));
        System.out.println("math.add(3L, 3L) - " + math.add(3L, 3L));

        int[] a = {10, 20, 30};
        System.out.println("math.add(a) - " + math.add(a));
    }
}
