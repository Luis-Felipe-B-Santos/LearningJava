package program;

import java.util.Scanner;

import entitites.Room;

//Criar 10 quartos vazios no sistema
//Ler quantidade de estudantes que irao alugar quartos
//Registrar aluguel, nome e email

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Room[] room = new Room[10];
		
		System.out.println("How many students will be renting a room?");
		int n = sc.nextInt();
		sc.nextLine();
		if (n > 10) {
			System.out.println("There are only 10 rooms available");
			System.exit(0);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Student name: ");
			String name = sc.nextLine();
			System.out.printf("%nStudent email: ");
			String email = sc.nextLine();
			System.out.printf("%nRent price: ");
			double price = sc.nextDouble();
			System.out.printf("%nRoom number: ");
			int number = sc.nextInt();
			sc.nextLine();
			room[number] = new Room(price, name, email, number);
			System.out.println();
		}
		
		for (int i = 0; i <room.length; i++) {
			System.out.println(room[i]);
		}
		sc.close();
	}

}
