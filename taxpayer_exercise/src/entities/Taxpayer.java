package entities;

public abstract class Taxpayer {
	private String name;
	protected Double income;
	
	public Taxpayer() {
		
	}
	
	public Taxpayer(String name, Double income) {
		super();
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setRavenue(Double income) {
		this.income = income;
	}

	public abstract double tax();
}
