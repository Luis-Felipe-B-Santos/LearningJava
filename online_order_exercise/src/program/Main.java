package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter Client data: \n");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth Date: ");
		Date birthDate = fmt1.parse(sc.nextLine());
		Client client = new Client(clientName, clientEmail, birthDate);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status \n"
				+ "(PENDING_PAYMENT) \n"
				+ "(PROCESSING) \n"
				+ "(SHIPPED) \n"
				+ "(DELIVERED) \n"
				+ "Order status: ");
		String orderStatus = sc.nextLine().toUpperCase();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
		
		
		System.out.print("How many itens to this order: ");
		int number = sc.nextInt();
		for (int i =0; i < number; i++) {
			sc.nextLine();
			System.out.println("Enter item #" + (i+1) + " data");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			orderItem.setPrice(product);
			order.addOrders(orderItem);
			System.out.print("\n");
		}
		
		System.out.println(order);
		sc.close();
	}

}
