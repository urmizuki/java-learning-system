package oop;

public class ProductionWorker extends Employee {
    // Constants for shifts
    public int DAY_SHIFT = 1;
    public int NIGHT_SHIFT = 2;

    private int shift;
    private double hourlyPayRate;

    // Default constructor
    public ProductionWorker() {
        super();
        this.shift = DAY_SHIFT;
        this.hourlyPayRate = 0.0;
    }

    // Parameterized constructor
    public ProductionWorker(String name, String employeeNumber, String hireDate,
                            int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    // Accessors
    public int getShift() { return shift; }

    public String getShiftName() {
        return (shift == DAY_SHIFT) ? "Day" : "Night";
    }

    public double getHourlyPayRate() { return hourlyPayRate; }

    // Mutators
    public void setShift(int shift) { this.shift = shift; }
    public void setHourlyPayRate(double hourlyPayRate) { this.hourlyPayRate = hourlyPayRate; }
}
