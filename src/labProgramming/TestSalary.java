package labProgramming;

public class TestSalary {
	public static void main(String[] args) {
		Salary worker1 = new Salary(45, 100);
		worker1.computeSalary();
		worker1.printSalary();	
		
		Salary worker2 = new Salary();
		worker2.computeSalary();
		worker2.printSalary();
	}
}
