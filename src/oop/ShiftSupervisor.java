package oop;

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualBonus;

    // Default constructor
    public ShiftSupervisor() {
        super();
        this.annualSalary = 0.0;
        this.annualBonus = 0.0;
    }

    // Parameterized constructor
    public ShiftSupervisor(String name, String employeeNumber, String hireDate,
                           double annualSalary, double annualBonus) {
        super(name, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    // Accessors
    public double getAnnualSalary() { return annualSalary; }
    public double getAnnualBonus() { return annualBonus; }

    // Mutators
    public void setAnnualSalary(double annualSalary) { this.annualSalary = annualSalary; }
    public void setAnnualBonus(double annualBonus) { this.annualBonus = annualBonus; }
}
