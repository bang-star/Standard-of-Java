package ch07.shape;

public class DeckTest {

    public static void main(String[] args) {
        Deck d = new Deck();

        Card c = d.pick();  // 섞기 전에 제일 위의 카드 선택
        System.out.println(c.toString());

        d.shuffle();
        c = d.pick();
        System.out.println(c);
    }
}
