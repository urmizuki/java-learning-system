import java.util.InputMismatchException;
import java.util.Scanner;

import labProgramming.Course;
import labProgramming.Customer;
import labProgramming.Order;
import labProgramming.Salary;
import selfExercise.Car;
import selfExercise.Exercise1;
import selfExercise.Halo;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printMainMenu();
            int choice = readMenuChoice();

            switch (choice) {
                case 1:
                    runOopModule();
                    break;
                case 2:
                    runExercisesModule();
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
        System.out.println("1. Run OOP examples");
        System.out.println("2. Run Exercises");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
    }

    private static int readMenuChoice() {
        try {
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            return choice;
        } catch (InputMismatchException exception) {
            SCANNER.nextLine();
            return -1;
        }
    }

    // Core OOP learning module: classes, object relationships, and behavior.
    private static void runOopModule() {
        System.out.println("\n--- OOP Module ---");
        runCustomerOrderExample();
        runCourseExample();
        runSalaryExample();
    }

    // Practice module: simple classes, validation, and basic logic exercises.
    private static void runExercisesModule() {
        System.out.println("\n--- Exercises Module ---");
        runCarExample();
        runExercise1Example();
        runHaloExample();
    }

    private static void runCustomerOrderExample() {
        System.out.println("\n[Example] Customer <-> Order relationship");
        Customer customer = new Customer(1, "Alif");
        Order order = new Order(101, customer);
        customer = new Customer(customer.getId(), customer.getName(), order);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Order No: " + customer.getOrder().getOrderNo());
    }

    private static void runCourseExample() {
        System.out.println("\n[Example] Course student management");
        Course course = new Course("SE 101");
        course.addStudent("Alif");
        course.addStudent("Amsyar");
        course.addStudent("Luqman");
        course.dropStudent("Amsyar");

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Students enrolled:");
        String[] students = course.getStudents();
        for (String student : students) {
            System.out.println("- " + student);
        }
    }

    private static void runSalaryExample() {
        System.out.println("\n[Example] Salary computation");
        Salary worker = new Salary(45, 100);
        double totalSalary = worker.computeSalary();
        System.out.println("Computed salary: RM " + totalSalary);
    }

    private static void runCarExample() {
        System.out.println("\n[Example] Car class with validation");
        Car car = new Car("Wira", 22);
        System.out.println("Initial: " + car);

        car.setBrand("Alza");
        car.setAge(5);
        System.out.println("Updated: " + car);
    }

    private static void runExercise1Example() {
        System.out.println("\n[Example] Exercise1 output");
        Exercise1.main(new String[0]);
    }

    private static void runHaloExample() {
        System.out.println("\n[Example] Vowel/consonant counter");
        Halo.main(new String[0]);
    }
}
