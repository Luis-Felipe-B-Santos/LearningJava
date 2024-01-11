package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		
		Account acc = new Account(1000, "Alex", 0.0);
		BusinessAccount bAcc = new BusinessAccount(1001, "Anna", 0.0, 500.0);
		
		//Fazendo UPCASTING
		//UPCASTING: Atribuir um objeto de uma subclasse para uma variavel da superclasse
		
		Account acc1 = bAcc;
		Account acc2 = new BusinessAccount(1002, "Bob", 0.0, 450.0);
		Account acc3 = new SavingsAccount(1003, "Maria", 0.0, 0.01);
		
		//Fazendo DOWNCASTING
		//DOWNCASTING: Converter um objeto da superclasse para a subclasse
		
		//BusinessAccount bAcc1 = acc2; 
		//acontece um erro de tipo mesmo a acc2 tendo sido iniciada como um BusinessAccount
		// para corrigir é necessario fazer um casting manual
		BusinessAccount bAcc2 = (BusinessAccount)acc2;
		bAcc2.loan1(100);
		
		//BusinessAccount bAcc3 = (BusinessAccount)acc3;
		//em tese isso é permitido porem ao executar dará um erro
		//Esse erro acontece porque a acc3 foi instanciada a partir de uma SavingsAccount
		//que não é um tipo de BusinnesAccount
		//Para evitar esse tipo de erro, checar usando o instanceOf
		
		if (acc3 instanceof BusinessAccount){
			BusinessAccount bAcc3 = (BusinessAccount)acc3;
			bAcc3.loan1(100);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount sAcc3 = (SavingsAccount)acc3;
			sAcc3.updateBalance();
			System.out.println("Balance update!");
		}
	}

}
