package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date momment;
	private OrderStatus status;
	private Client client;
	
	private static SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
	
	List<OrderItem> orders = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date momment, OrderStatus status, Client client) {
		super();
		this.momment = momment;
		this.status = status;
		this.client = client;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrders() {
		return orders;
	}
	
	public void addOrders(OrderItem order) {
		orders.add(order);
	}
	public void removeOrders(OrderItem order) {
		orders.remove(order);
	}
	
	public double total() {
		double sum = 0;
		for (OrderItem x : orders) {
			sum += x.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: " + "\n");
		sb.append("Order momment: ");
		sb.append(fmt1.format(momment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client.getName() + " ("  + fmt1.format(client.getBirthDate()) + ") " + client.getEmail());
		sb.append("\n" + "Order itens:" + "\n");
		for (OrderItem x : orders) {
			sb.append(x.getProduct().getName() + ", $");
			sb.append(x.getPrice());
			sb.append(" Quantity: " + x.getQuantity() + ", ");
			sb.append("Subtotal: $" + x.subTotal() + "\n");
		}
		sb.append("Total: $ " + total());
		return sb.toString();
	}
	
}
