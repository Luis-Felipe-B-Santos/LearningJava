package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter number of employees: ");
		int number = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			sc.nextLine();
			System.out.print("Employee #" + (i+1) + " data \n");
			System.out.println("Outsourced? (y/n): ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double vph = sc.nextDouble();
			if (resp == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, vph, additionalCharge);
				list.add(emp);
			}
			else {
				Employee emp = new Employee(name, hours, vph);
				list.add(emp);
			}
		}
		
		for (Employee x : list) {
			System.out.println(x.getName() + "- $" + String.format("%.2f", x.payment()));
		}
		
		
		sc.close();
	}

}
