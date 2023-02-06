package ch07.superConstructor;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "X: " + x + ", Y: " + y;
    }
}
