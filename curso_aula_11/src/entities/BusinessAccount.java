package entities;

//relacao de herança, a classe BusinessAccount É UM tipo de Account;
//na herança, a subclasse (BusinessAccount) herda os metodos e tipos da superclasse (Account);


public class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	BusinessAccount(){
		super();
	}
	//no caso do construtor, o super mostra os "itens" a serem herdados da superclasse
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan1(double ammount) { //usando um metodo herdado no metodo da subclasse
		if (ammount <= loanLimit) {
			deposit(ammount);
		}
	}
	
	public void loan2(double ammount) { //usando um atributo protegido da superclasse
		if (ammount <= loanLimit) {
			balance += ammount - 10;
		}
	}
	

}
