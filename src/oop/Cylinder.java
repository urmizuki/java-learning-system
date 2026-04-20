package oop;

public class Cylinder extends Circle {
    private double length;

    public Cylinder(double x, double y, double radius, double length) {
        super(x, y, radius);
        this.length = length;
    }

    @Override
    public double area() {
        return 2 * Math.PI * getRadius() * (length + getRadius());
    }

    public double getLength() { return length; }

    @Override
    public String toString() {
        return "Cylinder(center=(" + getX() + ", " + getY() + "), radius=" + getRadius() + ", length=" + length + ")";
    }
}
