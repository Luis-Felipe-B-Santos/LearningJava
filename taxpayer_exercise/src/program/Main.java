package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Taxpayer;

public class Main {

	public static void main(String[] args) {
		double totalTax = 0;
		Scanner sc = new Scanner (System.in);
		List<Taxpayer> list = new ArrayList<>();
		
		System.out.println("Number of taxpayers: ");
		int numberOfTaxpayers = sc.nextInt(); 
		boolean flag = false;
		
		
		do {
			for (int i = 0; i < numberOfTaxpayers; i++) {
				System.out.println("Pessoa Fisica(PF) or Pessoa Juridica(PJ)?");
				sc.nextLine();
				String response = sc.nextLine().toUpperCase();
				if (response.equals("PF")) {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Income: $");
					double income = sc.nextDouble();
					System.out.print("Healthcare expenses: $");
					double healthcare = sc.nextDouble();
					Taxpayer taxpayer = new PessoaFisica(name, income, healthcare);
					list.add(taxpayer);
					flag = true;
				} else if (response.equals("PJ")) {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Income: $");
					double income = sc.nextDouble();
					System.out.print("Number of employees: ");
					int numberOfEmployees = sc.nextInt();
					Taxpayer taxpayer = new PessoaJuridica(name, income, numberOfEmployees);
					list.add(taxpayer);
					flag = true;
				} else {
					System.out.println("That´s not a valid answer, please type again");	
				}
			}
		} while (flag == false);
		
		System.out.println("TAXES PAID:");
		for (Taxpayer x : list) {
			totalTax += x.tax(); 
			System.out.println(x.getName() + ": $" + x.tax());
		}
		System.out.println("TOTAL TAXES: $" + totalTax);
		
		sc.close();
	}

}
