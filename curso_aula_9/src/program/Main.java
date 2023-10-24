package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();
		
		System.out.println("Number of employees: ");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.printf("Employee id: ");
			int id = sc.nextInt();
			System.out.printf("%nEmployee Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("%nEmployee Salary: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(id, salary, name);
			empList.add(employee);
			System.out.println();
		}
		
		System.out.println("Enter the employee id that will have salary increase");
		int id = sc.nextInt();
		Employee employee = empList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("That´s not a valid answer");
		} else {
			System.out.printf("Enter the percentage: ");
			double raise = sc.nextDouble();
			employee.raiseSalary(raise);
			System.out.println();
		}
		
		for (Employee x : empList) {
			System.out.println(x);
		}
		sc.close();
	}

}
