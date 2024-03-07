package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// jogar o codigo que pode ter uma excessao dentro do try
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// jogar a possivel excessao dentro do catch
		//para que o programa continue a rodar mesmo apos o erro
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Position");
		}
		catch (InputMismatchException e){
			System.out.println("Input error");
		}
		System.out.println("End of program");
		
		sc.close();
	}

}
