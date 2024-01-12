package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	private Date manufactureDate;
	private final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product name: ");
		sb.append(name + "\n");
		sb.append("Product price: $");
		sb.append(price + "\n");
		sb.append("Product manufacure date: ");
		sb.append(fmt.format(manufactureDate));
		return sb.toString();
	}
	
	
}
