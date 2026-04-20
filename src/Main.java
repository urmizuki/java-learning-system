import java.util.Scanner;

import oop.Course;
import oop.Customer;
import oop.Order;
import oop.Salary;
import exercises.Car;
import exercises.Exercise1;
import exercises.Halo;

// Java Fundamentals Learning System:
// A small CLI that groups OOP and practice modules into a single beginner-friendly workflow.
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Customer currentCustomer;
    private static Order currentOrder;
    private static Course currentCourse;

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printMainMenu();
            int choice = readInt("Select an option: ");

            switch (choice) {
                case 1:
                    openOopModule();
                    break;
                case 2:
                    openPracticeModule();
                    break;
                case 3:
                    System.out.println("Goodbye. Keep building your Java fundamentals.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("\n=== Java Fundamentals Learning System ===");
        System.out.println("1. Core OOP module");
        System.out.println("2. Practice module");
        System.out.println("3. Exit");
    }

    private static void openOopModule() {
        boolean backToMain = false;
        while (!backToMain) {
            System.out.println("\n--- Core OOP Module ---");
            System.out.println("1. Customer -> Order workflow");
            System.out.println("2. Course registration system");
            System.out.println("3. Salary calculation");
            System.out.println("4. Back to main menu");

            int choice = readInt("Select an option: ");
            switch (choice) {
                case 1:
                    openCustomerOrderWorkflow();
                    break;
                case 2:
                    openCourseRegistrationSystem();
                    break;
                case 3:
                    runSalaryCalculation();
                    break;
                case 4:
                    backToMain = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
            }
        }
    }

    private static void openPracticeModule() {
        boolean backToMain = false;
        while (!backToMain) {
            System.out.println("\n--- Practice Module ---");
            System.out.println("1. Car class demo");
            System.out.println("2. Exercise1");
            System.out.println("3. Halo vowel/consonant counter");
            System.out.println("4. Back to main menu");

            int choice = readInt("Select an option: ");
            switch (choice) {
                case 1:
                    runCarDemo();
                    break;
                case 2:
                    Exercise1.main(new String[0]);
                    break;
                case 3:
                    Halo.main(new String[0]);
                    break;
                case 4:
                    backToMain = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
            }
        }
    }

    // Real workflow: user creates a customer, creates an order, then views linked data.
    private static void openCustomerOrderWorkflow() {
        boolean backToOopMenu = false;
        while (!backToOopMenu) {
            System.out.println("\n--- Customer -> Order Workflow ---");
            System.out.println("1. Create customer");
            System.out.println("2. Create order for current customer");
            System.out.println("3. View customer + order summary");
            System.out.println("4. Back");

            int choice = readInt("Select an option: ");
            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                    createOrderForCurrentCustomer();
                    break;
                case 3:
                    printCustomerOrderSummary();
                    break;
                case 4:
                    backToOopMenu = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
            }
        }
    }

    private static void createCustomer() {
        int id = readInt("Customer ID: ");
        String name = readNonEmptyText("Customer name: ");
        currentCustomer = new Customer(id, name);
        currentOrder = null;
        System.out.println("Customer created: " + currentCustomer.getName() + " (ID: " + currentCustomer.getId() + ")");
    }

    private static void createOrderForCurrentCustomer() {
        if (currentCustomer == null) {
            System.out.println("No customer found. Please create a customer first.");
            return;
        }

        int orderNo = readInt("Order number: ");
        currentOrder = new Order(orderNo, currentCustomer);

        // Customer has no setOrder method, so rebuild object with linked order.
        currentCustomer = new Customer(currentCustomer.getId(), currentCustomer.getName(), currentOrder);
        System.out.println("Order linked to customer successfully.");
    }

    private static void printCustomerOrderSummary() {
        if (currentCustomer == null) {
            System.out.println("No customer found. Please create a customer first.");
            return;
        }

        System.out.println("Customer ID   : " + currentCustomer.getId());
        System.out.println("Customer Name : " + currentCustomer.getName());
        if (currentCustomer.getOrder() == null) {
            System.out.println("Order         : Not created yet");
        } else {
            System.out.println("Order Number  : " + currentCustomer.getOrder().getOrderNo());
        }
    }

    // Feature story (Option A): simple in-memory course registration flow.
    private static void openCourseRegistrationSystem() {
        boolean backToOopMenu = false;
        while (!backToOopMenu) {
            System.out.println("\n--- Course Registration System ---");
            System.out.println("1. Create course");
            System.out.println("2. Register student");
            System.out.println("3. Drop student");
            System.out.println("4. View roster");
            System.out.println("5. Back");

            int choice = readInt("Select an option: ");
            switch (choice) {
                case 1:
                    createCourse();
                    break;
                case 2:
                    registerStudent();
                    break;
                case 3:
                    dropStudent();
                    break;
                case 4:
                    viewRoster();
                    break;
                case 5:
                    backToOopMenu = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, 4, or 5.");
            }
        }
    }

    private static void createCourse() {
        String courseName = readNonEmptyText("Course name: ");
        currentCourse = new Course(courseName);
        System.out.println("Course created: " + currentCourse.getCourseName());
    }

    private static void registerStudent() {
        if (currentCourse == null) {
            System.out.println("No course found. Please create a course first.");
            return;
        }

        String studentName = readNonEmptyText("Student name to register: ");
        currentCourse.addStudent(studentName);
        System.out.println("Student registered successfully.");
    }

    private static void dropStudent() {
        if (currentCourse == null) {
            System.out.println("No course found. Please create a course first.");
            return;
        }

        String studentName = readNonEmptyText("Student name to drop: ");
        currentCourse.dropStudent(studentName);
    }

    private static void viewRoster() {
        if (currentCourse == null) {
            System.out.println("No course found. Please create a course first.");
            return;
        }

        String[] students = currentCourse.getStudents();
        System.out.println("Course: " + currentCourse.getCourseName());
        System.out.println("Total students: " + currentCourse.getNumberOfStudents());
        if (students.length == 0) {
            System.out.println("Roster is empty.");
            return;
        }

        System.out.println("Roster:");
        for (String student : students) {
            System.out.println("- " + student);
        }
    }

    private static void runSalaryCalculation() {
        System.out.println("\n--- Salary Calculation ---");
        double hours = readNonNegativeDouble("Working hours: ");
        double rate = readNonNegativeDouble("Hourly rate: ");

        Salary worker = new Salary(hours, rate);
        double totalSalary = worker.computeSalary();
        System.out.println("Computed salary: RM " + totalSalary);
    }

    private static void runCarDemo() {
        System.out.println("\n--- Car Demo ---");
        String brand = readNonEmptyText("Car brand: ");
        int age = readNonNegativeInt("Car age: ");

        try {
            Car car = new Car(brand, age);
            System.out.println("Created: " + car);
        } catch (RuntimeException exception) {
            System.out.println("Failed to create car: " + exception.getMessage());
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static int readNonNegativeInt(String prompt) {
        while (true) {
            int value = readInt(prompt);
            if (value >= 0) {
                return value;
            }
            System.out.println("Please enter a non-negative integer.");
        }
    }

    private static double readNonNegativeDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value >= 0) {
                    return value;
                }
                System.out.println("Please enter a non-negative number.");
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static String readNonEmptyText(String prompt) {
        while (true) {
            System.out.print(prompt);
            String text = SCANNER.nextLine().trim();
            if (!text.isEmpty()) {
                return text;
            }
            System.out.println("Input must not be empty.");
        }
    }
}
