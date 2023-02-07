package ch07.polyArgument.ex3;

public class Product {
    private int price;
    private int bonusPoint;

    Product() { }

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
