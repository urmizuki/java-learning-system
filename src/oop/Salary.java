//ALIF SAFWAN BIN SAIFUL ADLI
//BC252095

package oop;
import java.util.Scanner;

public class Salary {
	double hours, rate, salary;
	
	public Salary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter working hours:\t");
		this.hours = sc.nextDouble();
		System.out.print("Enter workers rate:\t");
		this.rate = sc.nextDouble();
	}
	
	//rate
	public Salary(double hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	//calc
	public double computeSalary() {
		salary = hours * rate;
		return salary;
	}
	//print
	public void printSalary() {
		System.out.println("Salary:\tRM " + salary);
	}

}
