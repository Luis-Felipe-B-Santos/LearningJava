package entities;

public class BankAccount {
	private int accNumber;
	private String accHolder;
	private double initialDeposit;
	private double money;
	public static final double TAX = 5.00;
	
	public int getAccNumber() {
		return accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public double getMoney() {
		return money;
	}

	public BankAccount(int accNumber, String accHolder) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}


	public BankAccount(int accNumber, String accHolder, double initialDeposit) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.initialDeposit = initialDeposit;
	}

	public BankAccount() {
	}

	public void deposit (double ammount){
		this.money += ammount;
	}
	
	public void total() {
		this.money = initialDeposit;
	}
	public void withdraw (double ammount){
		this.money -= ammount - TAX;
	}

	@Override
	public String toString() {
		return "Account number: " + accNumber + 
				", Account Holder: " + accHolder + 
				", Initial deposit: " + initialDeposit
				+ ", Money: $ " + money;
	}
	
	
}
