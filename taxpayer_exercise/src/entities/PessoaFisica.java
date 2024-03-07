package entities;

public class PessoaFisica extends Taxpayer {

	private Double healthcareExpenses;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String name, Double income, Double healthcareExpenses) {
		super(name, income);
		this.healthcareExpenses = healthcareExpenses;
	}

	

	public Double getHealthcareExpenses() {
		return healthcareExpenses;
	}

	public void setHealthcareExpenses(Double healthcareExpenses) {
		this.healthcareExpenses = healthcareExpenses;
	}

	@Override
	public double tax() {
		if (healthcareExpenses > 0) {
			if (income <= 20000) {
				return income * 0.15 - healthcareExpenses * 0.5;
			} else {
				return income * 0.25 - healthcareExpenses * 0.5;
			}
		} else {
			if (income <= 20000) {
				return income * 0.15;
			} else {
				return income * 0.25;
			}
		}
	}

}
