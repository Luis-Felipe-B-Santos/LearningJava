package program;

import java.util.Scanner;

import util.CurrencyConverter;
 //exercicio de fixacao sobre metodo estatico e constantes

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dollar exchange rate: ");
		double exchangeRate = sc.nextDouble();
		
		System.out.println("How many dollars are you buying?");
		double buy = sc.nextDouble();
		
		double total = CurrencyConverter.calculator(exchangeRate, buy);
		
		System.out.printf("Amount to be paind in R$: %.2f", total);
		
		sc.close();
	}

}
