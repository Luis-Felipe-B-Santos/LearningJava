package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		char resp;
		
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			boolean flag = false;
			do {
				System.out.print("Common, used or imported? (c/u/i)\n");
				resp = sc.next().toLowerCase().charAt(0);
				if (resp != 'c' && resp != 'u' && resp != 'i') {
					System.out.println("That's not a valid answer, please type again");
				}
				else if (resp == 'c') {
					sc.nextLine();
					System.out.print("Product name: ");
					String name = sc.nextLine();
					System.out.print("Product price: $");
					Double price = sc.nextDouble();
					Product prod = new Product(name, price);
					list.add(prod);
					flag = true;
				}
				else if (resp == 'u') {
					sc.nextLine();
					System.out.print("Product name: ");
					String name = sc.nextLine();
					System.out.print("Product price: $");
					Double price = sc.nextDouble();
					System.out.print("Manufacture Date (DD/MM/YYYY): ");
					sc.nextLine();
					Date date = fmt.parse(sc.nextLine());
					Product prod = new UsedProduct(name, price, date);
					list.add(prod);
					flag = true;
				}
				else if (resp == 'i') {
					sc.nextLine();
					System.out.print("Product name: ");
					String name = sc.nextLine();
					System.out.print("Product price: $");
					Double price = sc.nextDouble();
					System.out.print("Customs fee: $");
					Double fee = sc.nextDouble();
					Product prod = new ImportedProduct(name, price, fee);
					list.add(prod);
					flag = true;
				}
			}while (flag == false);
		}
		
		for (Product x : list) {
			if(x instanceof ImportedProduct) {
				ImportedProduct prod = (ImportedProduct)x;
				System.out.print(prod.priceTag() + prod.totalPrice());
			}
			else{
				System.out.print(x.priceTag());
			}
		}	
		sc.close();
	}

}
