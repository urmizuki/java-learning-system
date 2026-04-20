package oop;

public class Circle extends Point {
    private double radius;

    //constructor
    public Circle (double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }    

    //getter
    
    public double getRadius() { return radius; }

    @Override
    public String toString() {
        return "Circle(center=(" + getX() + ", " + getY() + "), radius=" + radius + ")";
    }
}
