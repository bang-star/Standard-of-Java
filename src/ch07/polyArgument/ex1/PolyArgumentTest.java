package ch07.polyArgument.ex1;

public class PolyArgumentTest {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new TV());
        buyer.buy(new Computer());

        System.out.println("현재 남은 돈은 " + buyer.getMoney());
        System.out.println("현재 보너스 점수는 " + buyer.getBonusPoint());
    }
}
