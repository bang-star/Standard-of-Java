package ch07.polyArgument.ex1;

public class Product {
    private int price;
    private int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
