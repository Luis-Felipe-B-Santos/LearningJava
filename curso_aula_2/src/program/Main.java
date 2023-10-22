package program;

import java.util.Locale;

//Exercicio de fixacao da aula
//Inicie as variaveis e exiba de forma especifica no console
public class Main {

	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		char gender = 'F';
		int code = 5290;
		
		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.23456785;
		
		System.out.printf("Products:%n");
		System.out.printf(" %s, which price is %.2f%n ", product1, price1);
		System.out.printf("%s, which price is %.2f %n%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n%n", age, code, gender);
		
		System.out.printf("Measure with 8 decimals: %f%n", measure);
		System.out.printf("Rounded measure (2 decimals): %.2f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rounded measure Us decimal point: %.2f", measure);
		
		
	}

}
