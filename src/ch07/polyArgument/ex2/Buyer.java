package ch07.polyArgument.ex2;

public class Buyer {
    private int money = 1000;
    private int bonusPoint = 0;

    Product[] item = new Product[10];
    int i = 0;

    void buy(Product product){
        if(money < product.getPrice()) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }

        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        item[i++] = product;
        System.out.println(product + "을/를 구입완료하였습니다.");
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();

        for(Product p: item){
            if(p == null) break;

            sum += p.getPrice();
            itemList.append(p).append(", ");
        }
        System.out.println("구입한 물건의 총금액 : " + sum);
        System.out.println("구입한 제품: " + itemList);
    }

    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
