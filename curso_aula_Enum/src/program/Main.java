package program;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		
		//Passando uma string para o formato do enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		System.out.println("What is your order status?");
		String res = sc.nextLine();
		
		OrderStatus os2 = OrderStatus.valueOf(res);
		
		Order order1 = new Order(100, new Date(), os1);
		Order order2 = new Order(101, new Date(), os2);
		
		System.out.println(order1);
		System.out.println(order2);
		
		sc.close();
	}

}
