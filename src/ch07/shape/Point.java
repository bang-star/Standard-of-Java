package ch07.shape;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getPoint() {
        return "(" + x + ", " + y + ")";
    }
}
