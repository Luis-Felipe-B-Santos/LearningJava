package program;

import java.util.Locale;
import java.util.Scanner;

//Exercicio de fixacao da aula
//Com base na tabela, ler o item, ler a quantidade, informar o total, usar apenas array e condicional 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String[] foodItens = {"Cachorro quente", "X-Salada", "X-Bacon", "Refrigerante"};
		
		double[] prices = {3.0, 3.5, 4.0, 2.0};
		double total = 0;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Menu: ");
		for (int i = 0; i < 4; i++) {
			System.out.printf("Code:%d Product: %s Price: $%.2f %n",i+1, foodItens[i], prices[i]);
		}
		
		System.out.println("How many itens will you be ordering?");
		int numberOfItens = sc.nextInt();
		
		for (int i = 0; i <numberOfItens; i++) {
			System.out.println("Item code: ");
			int code = sc.nextInt();
			
			
			switch (code) {
				case 1:
					total += prices[0];
							break;
				case 2:
					total += prices[1];
							break;
				case 3:
					total += prices[2];
							break;
				case 4:
					total += prices[3];
							break;
				default:
					System.out.println("Please type a valid code");
			}
			
		}
		
		System.out.printf("Total: $%.2f", total);
		
		sc.close();
	}
}
