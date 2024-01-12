package entities;

public final class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price += customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product name: ");
		sb.append(name + "\n");
		sb.append("Product price: $");
		sb.append(price + "\n");
		sb.append("Customs Fee: ");
		sb.append(customsFee + "\n");
		sb.append("Product total: $");
		return sb.toString();
	}
}
