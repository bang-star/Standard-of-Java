package ch07.shape;

public class Circle extends Shape {
    Point center;   // 원점좌표
    int r;          // 반지름

    Circle() {
        this(new Point(0, 0), 100);
    }

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[Center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}
