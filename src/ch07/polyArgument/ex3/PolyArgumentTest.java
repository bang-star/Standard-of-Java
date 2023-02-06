package ch07.polyArgument.ex3;

public class PolyArgumentTest {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();

        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.summary();

        System.out.println("=======================");

        buyer.refund(computer);
        buyer.summary();
    }
}
