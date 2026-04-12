package selfExercise;

import java.util.Objects;

public class Car {
    private static final String DEFAULT_BRAND = "Unknown";
    private static final int DEFAULT_AGE = 0;

    private String brand;
    private int age;

    public Car() {
        this(DEFAULT_BRAND, DEFAULT_AGE);
    }

    public Car(String brand, int age) {
        setBrand(brand);
        setAge(age);
    }

    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public void setBrand(String brand) {
        String normalizedBrand = Objects.requireNonNull(brand, "Brand must not be null").trim();
        if (normalizedBrand.isEmpty()) {
            throw new IllegalArgumentException("Brand must not be blank");
        }
        this.brand = normalizedBrand;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Car{brand='%s', age=%d}", brand, age);
    }
}
