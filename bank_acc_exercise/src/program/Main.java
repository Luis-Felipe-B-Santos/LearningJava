package program;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		BankAccount acc;
		
		System.out.println("Account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Account holder name: ");
		String name = sc.nextLine();
		System.out.println("Will the new account have an initial deposit? (Y/N)");
		String answer = sc.next();
		answer = answer.toUpperCase();
		char response = answer.charAt(0);
		sc.nextLine();
		if (response == 'Y') {
			System.out.println("Initial deposit: ");
			double deposit = sc.nextDouble();
			acc = new BankAccount(number, name, deposit);
			acc.total();
		}else if (response == 'N') {
			acc = new BankAccount(number, name);	
		}else {
			acc = new BankAccount();
			System.out.println("That´s not a valid answer");
		}
		sc.nextLine();
		System.out.println();
		System.out.println(acc);
		
		boolean flag = false;
		do {
			System.out.println("Do you wish to deposit money? (Y/N)");
			answer = sc.next();
			answer = answer.toUpperCase();
			response = answer.charAt(0);
			
			if (response == 'Y') {
				System.out.printf("Deposit ammount: $ ");
				double deposit = sc.nextDouble();
				acc.deposit(deposit);
				System.out.printf("%nNew details:");
				System.out.println(acc);
				flag = true;
			}else if (response == 'N') {
				flag = true;
			}else {
				System.out.println("That´s not a valid answer, please type again");
			}
		}while (flag == false);
		
		flag = false;
		do {
			System.out.println();
			System.out.println("Do you wish to withdraw money? (Y/N)");
			response = sc.next().toUpperCase().charAt(0);
			if(response == 'Y') {
				System.out.printf("Withdraw ammout: $ ");
				double withdraw = sc.nextDouble();
				acc.withdraw(withdraw);
				System.out.printf("%nNew balance: ");
				System.out.println(acc);
				flag = true;
			}else if (response == 'N') {
				flag = true;
			}else {
				System.out.println("That´s not a valid answer, please type again");
			}
		}while (flag == false);
		sc.close();
	}

}
