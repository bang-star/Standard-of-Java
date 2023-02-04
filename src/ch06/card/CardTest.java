package ch06.card;

public class CardTest {

    public static void main(String[] args) {
        cardTest1();
    }

    private static void cardTest1() {
        System.out.printf("Card Width/Height: %d/%d \n", Card.width, Card.height);

        Card card1 = new Card();
        card1.kind = "Heart";
        card1.number = 7;

        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 5;

        System.out.printf("card1 무늬: %s, 숫자: %d, 크기: %d, 높이: %d \n", card1.kind, card1.number, card1.width, card1.height);
        System.out.printf("card2 무늬: %s, 숫자: %d, 크기: %d, 높이: %d \n", card2.kind, card2.number, card2.width, card2.height);

        card1.width = 50;
        card1.height = 80;

        System.out.printf("card1 무늬: %s, 숫자: %d, 크기: %d, 높이: %d \n", card1.kind, card1.number, card1.width, card1.height);
        System.out.printf("card2 무늬: %s, 숫자: %d, 크기: %d, 높이: %d \n", card2.kind, card2.number, card2.width, card2.height);
    }
}
