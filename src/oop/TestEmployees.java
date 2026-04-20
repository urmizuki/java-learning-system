package oop;

public class TestEmployees {
    public static void main(String[] args) {

        // ===== PRODUCTION WORKER =====
        System.out.println("===== PRODUCTION WORKER =====");

        // Create first ProductionWorker
        ProductionWorker pw1 = new ProductionWorker(
                "Ali Hassan", "123-A", "2020-01-15",
                1, 25.50);

        // Create second ProductionWorker
        ProductionWorker pw2 = new ProductionWorker(
                "Siti Rahimah", "456-B", "2021-06-01",
                2, 30.00);

        // Display pw1 details
        System.out.println("Name: " + pw1.getName());
        System.out.println("Employee No: " + pw1.getEmployeeNumber());
        System.out.println("Hire Date: " + pw1.getHireDate());
        System.out.println("Shift: " + pw1.getShiftName());
        System.out.printf("Hourly Pay Rate: RM%.1f%n", pw1.getHourlyPayRate());
        System.out.println();

        // Display pw2 details
        System.out.println("Name: " + pw2.getName());
        System.out.println("Employee No: " + pw2.getEmployeeNumber());
        System.out.println("Hire Date: " + pw2.getHireDate());
        System.out.println("Shift: " + pw2.getShiftName());
        System.out.printf("Hourly Pay Rate: RM%.1f%n", pw2.getHourlyPayRate());
        System.out.println();

        // Update pw1 details and display again
        pw1.setName("Ali bin Hassan");
        pw1.setShift(2);
        pw1.setHourlyPayRate(28.00);

        System.out.println("-- After updating pw1 details --");
        System.out.println("Name: " + pw1.getName());
        System.out.println("Employee No: " + pw1.getEmployeeNumber());
        System.out.println("Hire Date: " + pw1.getHireDate());
        System.out.println("Shift: " + pw1.getShiftName());
        System.out.printf("Hourly Pay Rate: RM%.1f%n", pw1.getHourlyPayRate());
        System.out.println();

        // ===== SHIFT SUPERVISOR =====
        System.out.println("===== SHIFT SUPERVISOR =====");

        // Create first ShiftSupervisor
        ShiftSupervisor ss1 = new ShiftSupervisor(
                "Ahmad Fadzil", "789-M", "2018-03-10",
                84000.00, 12000.00);

        // Create second ShiftSupervisor
        ShiftSupervisor ss2 = new ShiftSupervisor(
                "Lim Wei Ling", "321-C", "2019-07-22",
                90000.00, 15000.00);

        // Display ss1 details
        System.out.println("Name: " + ss1.getName());
        System.out.println("Employee No: " + ss1.getEmployeeNumber());
        System.out.println("Hire Date: " + ss1.getHireDate());
        System.out.printf("Annual Salary: RM%.1f%n", ss1.getAnnualSalary());
        System.out.printf("Annual Bonus: RM%.1f%n", ss1.getAnnualBonus());
        System.out.println();

        // Display ss2 details
        System.out.println("Name: " + ss2.getName());
        System.out.println("Employee No: " + ss2.getEmployeeNumber());
        System.out.println("Hire Date: " + ss2.getHireDate());
        System.out.printf("Annual Salary: RM%.1f%n", ss2.getAnnualSalary());
        System.out.printf("Annual Bonus: RM%.1f%n", ss2.getAnnualBonus());
        System.out.println();

        // Update ss1 bonus and display again
        ss1.setAnnualBonus(14000.00);

        System.out.println("-- After updating ss1 bonus --");
        System.out.println("Name: " + ss1.getName());
        System.out.println("Employee No: " + ss1.getEmployeeNumber());
        System.out.println("Hire Date: " + ss1.getHireDate());
        System.out.printf("Annual Salary: RM%.1f%n", ss1.getAnnualSalary());
        System.out.printf("Annual Bonus: RM%.1f%n", ss1.getAnnualBonus());
        System.out.println();
    }
}
