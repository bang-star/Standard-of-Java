package ch06.variable;

public class ProductTest {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.printf("p1의 제품번호(serial no)는  %d\n", p1.serialNo);
        System.out.printf("p2의 제품번호(serial no)는  %d\n", p2.serialNo);
        System.out.printf("p3의 제품번호(serial no)는  %d\n", p3.serialNo);
        System.out.println("생성된 제품의 수는 모두 " + Product.count +"개 입니다.");
    }
}
