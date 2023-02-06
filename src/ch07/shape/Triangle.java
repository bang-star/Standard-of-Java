package ch07.shape;

public class Triangle extends Shape {
    Point[] p;

    public Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getPoint(), p[1].getPoint(), p[2].getPoint(), color);
    }
}
