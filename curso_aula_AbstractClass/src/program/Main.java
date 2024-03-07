package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		//Account acc1 = new Account(1000, "Alex", 1000.0); 
		//nao pode ser instanciado pois é abstrato
		Account acc2 = new BusinessAccount(1001, "Bob", 1000.0, 500.0);
		Account acc3 = new SavingsAccount(1002, "Caco", 1000.0, 0.1);
		
		
		
	}
}
