package ch07.polyArgument.ex2;

public class PolyArgumentTest {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new TV());
        buyer.buy(new Computer());
        buyer.buy(new Audio());

        buyer.summary();
    }
}
