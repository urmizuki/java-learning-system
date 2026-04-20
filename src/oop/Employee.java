package oop;

public class Employee {
    private String name;
    private String employeeNumber; // Format: XXX-L
    private String hireDate;

    // Default constructor
    public Employee() {
        this.name = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }

    // Parameterized constructor
    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    // Accessors
    public String getName() { return name; }
    public String getEmployeeNumber() { return employeeNumber; }
    public String getHireDate() { return hireDate; }

    // Mutators
    public void setName(String name) { this.name = name; }
    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }
    public void setHireDate(String hireDate) { this.hireDate = hireDate; }
}
