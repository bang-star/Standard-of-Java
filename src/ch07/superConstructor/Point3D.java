package ch07.superConstructor;

public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {  // 오버라이딩
        return "X: " + x + ", Y: " + y + ", Z:" + z;
    }
}
