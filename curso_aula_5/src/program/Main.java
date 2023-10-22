package program;
//Exercicio de fixacacao de OOP
//Comparar a area de 2 triangulos

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Triangle 1 measures: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		Triangle triangle1 = new Triangle(a, b, c);
		
		System.out.println("Triangle 2 measures: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		Triangle triangle2 = new Triangle(x, y, z);
		
		System.out.printf("Triangle 1: %.2f, %.2f, %.2f %n", triangle1.getSideA(), triangle1.getSideB(), triangle1.getSideC());
		System.out.printf("Triangle 2: %.2f, %.2f, %.2f %n", triangle2.getSideA(), triangle2.getSideB(), triangle2.getSideC());

		double area1 = triangle1.areaCalculator();
		double area2 = triangle2.areaCalculator();
		
		if (area1 > area2) {
			System.out.println("Triangle 1 is bigger");
		} if (area1 < area2) {
			System.out.println("Triangle 2 is bigger");
		} else {
			System.out.println("They have the same size");
		}
		
		sc.close();
	}

}
