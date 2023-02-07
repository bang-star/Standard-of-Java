package ch07.finalCard;

public class CardTest {
    public static void main(String[] args) {
        Card c = new Card(10, "HEART");

        System.out.println(c.NUMBER);
        System.out.println(c.KIND);
        System.out.println(c);
    }
}
