package ch07.polyArgument.ex3;

import java.util.Vector;

public class Buyer {
    private int money = 1000;
    private int bonusPoint = 0;

    Vector item = new Vector();

    void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }

        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        item.add(product);
        System.out.println(product + "을/를 구입완료하였습니다.");
    }

    void refund(Product product) {
        if (item.remove(product)) {
            money += product.getPrice();
            bonusPoint -= product.getBonusPoint();
            System.out.println(product + "을/를 반품 완료하였습니다.");
        } else {
            System.out.println(product + "을/를 구매한 이력이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();

        if(item.isEmpty()){
            System.out.println("구매한 제품이 없습니다.");
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
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
