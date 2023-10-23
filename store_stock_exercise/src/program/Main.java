package program;

import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of products: ");
		int size = sc.nextInt();
		Product[] product = new Product[size]; //array de produtos inicializado com o tamanho especificado
		sc.nextLine();
		
		for (int i = 0; i < size; i++) {   //estrutura para cadastrar os produtos utilizando um construtor
			System.out.println("Product name: ");
			String name = sc.nextLine();
			System.out.println("Product price ($): ");
			double price = sc.nextDouble();
			System.out.println("Quantity in stock: ");
			int quantity = sc.nextInt();
			product[i] = new Product(name, price, quantity);
			sc.nextLine();
		}
		
		// necessario criar um menu para adicionar ou retirar quantidades do estoque
		
		boolean flag = false; // flag para o loop de menu
		boolean flag1 = false; // flag para o loop de alteracao
		
		do {
			System.out.println("Do you wish to alter the quantity of a product in stock? (Y/N)");
			String answer = sc.next();
			answer = answer.toUpperCase();
			char response = answer.charAt(0);
			
			if (response == 'Y') {
				System.out.println("List of products: ");
				for (int i = 0; i< size; i++) {
					System.out.printf("%nProduct code: %d ", i);
					System.out.println(product[i].toString());
				}
				System.out.println("Code of the product you wish to alter quantity: ");
				int code = sc.nextInt();
				if (code > size) {
					System.out.println("Thats not a valid code, please type again");
				} else {
					do {
					System.out.printf("To add a quantity type 1%nTo remove type 2%n");
					int aux = sc.nextInt();
					
					if (aux == 1) {
						System.out.println("Number of products to be added to stock: ");
						int newStock = sc.nextInt();
						product[code].addProducts(newStock);
						flag1 = true;
					}
					
					else if (aux == 2) {
						System.out.println("Number of products to be removed from stock: ");
						int newStock = sc.nextInt();
						product[code].removeProducts(newStock);
						flag1 = true;
					}
					
					else {
						System.out.println("Thats not a valid answer, please type again");
					}
				}while (flag1 == false);
				}
			} else if (response == 'N') {
				System.out.println("Thank you!");
				flag = true;
			}else {
				System.out.println("Thats not a valid answer, please type again");
			}
		}while (flag == false);	
		sc.close();
	}

}
