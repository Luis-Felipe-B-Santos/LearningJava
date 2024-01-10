package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Product product) {
		this.price = product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		double result = this.price * this.quantity;
		return result;
	}
	
}
