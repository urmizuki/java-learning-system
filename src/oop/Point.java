package oop;

public class Point {
    private double x;
    private double y;

    //constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

   //base area
    public double area() {
        return 0;
    }

    //distance
    public double distance(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //getter
    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

} 
