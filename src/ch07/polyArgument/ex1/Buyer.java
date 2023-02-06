package ch07.polyArgument.ex1;

public class Buyer {
    private int money = 1000;
    private int bonusPoint = 0;

    void buy(Product product){
        if(money < product.getPrice()) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }

        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.println(product + "을/를 구입완료하였습니다.");
    }

    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
