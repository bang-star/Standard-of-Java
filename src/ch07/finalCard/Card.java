package ch07.finalCard;

public class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    public Card(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    Card() {
        this(1, "HEART");
    }

    public String toString() {
        return "KIND, NUMBER: " + KIND + ", " + NUMBER;
    }
}
