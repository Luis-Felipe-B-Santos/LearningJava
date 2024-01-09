package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Department name:");
		String department = sc.nextLine();
		
		System.out.printf("%n");
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level (Junior, Mid or Senior): ");
		String level = sc.next().toUpperCase();
		sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker: ");
		int numberOfContracts = sc.nextInt();
		for (int i = 0; i < numberOfContracts; i++) {
			System.out.printf("Enter contract #" + (i+1) + " data%n");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = fmt1.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration of contract (hours): ");
			int duration = sc.nextInt();
			HourContract hourContract = new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(hourContract);
			sc.nextLine();
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int year = Integer.parseInt(monthAndYear.substring(3, 6));
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		double yearIncome = worker.income(year, month);
		
		System.out.printf("Worker: " + worker.getName() + "%n");
		System.out.printf("Department: " + worker.getDepartment().getDeptName() + "%n");
		System.out.print("Income for " + monthAndYear + ": " + yearIncome);
		sc.close();
	}

}
