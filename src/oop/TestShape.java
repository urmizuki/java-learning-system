package oop;
public class TestShape {
    public static void main(String[] args) {
        // ── Question 1(a): Point & Circle ──────────────────────────
        System.out.println("===== Point Tests =====");
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(-1, -1);
        Point p4 = new Point(6, 8);
        System.out.printf("%s | area: %.2f | distance to p2: %.2f%n", p1, p1.area(), p1.distance(p2));
        System.out.printf("%s | area: %.2f | distance to p3: %.2f%n", p2, p2.area(), p2.distance(p3));
        System.out.printf("%s | area: %.2f | distance to p4: %.2f%n", p3, p3.area(), p3.distance(p4));
        System.out.printf("%s | area: %.2f | distance to p1: %.2f%n", p4, p4.area(), p4.distance(p1));
        System.out.println("\n===== Circle Tests =====");
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(1, 1, 3);
        Circle c3 = new Circle(-2, 4, 7);
        Circle c4 = new Circle(10, 10, 1);
        System.out.printf("%s | area: %.2f%n", c1, c1.area());
        System.out.printf("%s | area: %.2f%n", c2, c2.area());
        System.out.printf("%s | area: %.2f%n", c3, c3.area());
        System.out.printf("%s | area: %.2f%n", c4, c4.area());
        // ── Question 1(b): Cylinder ────────────────────────────────
        System.out.println("\n===== Cylinder Tests =====");
        Cylinder cy1 = new Cylinder(0, 0, 5, 10);
        Cylinder cy2 = new Cylinder(1, 1, 3, 7);
        Cylinder cy3 = new Cylinder(-2, 4, 7, 2);
        Cylinder cy4 = new Cylinder(10, 10, 1, 15);
        System.out.printf("%s | surface area: %.2f%n", cy1, cy1.area());
        System.out.printf("%s | surface area: %.2f%n", cy2, cy2.area());
        System.out.printf("%s | surface area: %.2f%n", cy3, cy3.area());
        System.out.printf("%s | surface area: %.2f%n", cy4, cy4.area());
    }
}
