package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = fmt.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = fmt.parse(sc.next());
			Reservation reservation = new Reservation(roomNumber,checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			
			System.out.println("Enter data to update reservation");
			System.out.print("Room number: ");
			roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = fmt.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = fmt.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		//catch com excessao padrao do java
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		//catch com excessao personalizada que eu notei no meu programa
		catch (DomainException e) {
			System.out.println("Error in reservation" + e.getMessage());
		}
		//catch para qualquer outro erro que eu n pensei em pegar, um catch generico
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		
	sc.close();
	}
}