package entities;

public class PessoaJuridica extends Taxpayer{

	private Integer numberOfEmployees;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return income * 0.14;
		} else {
			return income * 0.16;
		}
	}

}
