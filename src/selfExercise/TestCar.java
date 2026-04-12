package selfExercise;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("=== Constructor Demo ===");
        Car defaultCar = new Car();
        Car customCar = new Car("Wira", 22);
        System.out.println("Default car: " + defaultCar);
        System.out.println("Custom car : " + customCar);

        System.out.println("\n=== Getter Demo ===");
        System.out.println("Brand: " + customCar.getBrand());
        System.out.println("Age  : " + customCar.getAge());

        System.out.println("\n=== Setter Demo ===");
        customCar.setBrand("Alza");
        customCar.setAge(5);
        System.out.println("Updated car: " + customCar);

        System.out.println("\n=== Validation Demo ===");
        try {
            customCar.setBrand("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Blank brand rejected: " + e.getMessage());
        }

        try {
            customCar.setBrand(null);
        } catch (NullPointerException e) {
            System.out.println("Null brand rejected: " + e.getMessage());
        }

        try {
            customCar.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Negative age rejected: " + e.getMessage());
        }

        System.out.println("\nFinal state: " + customCar);
    }
}
