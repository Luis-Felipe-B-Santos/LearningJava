package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		//esse metodo vai servir pra ver a diferença em dias de duas datas
		//esta em long pq o padrao mais natural é o getTime, que é em milissegundos
		long diff = checkOut.getTime() - checkIn.getTime();
		//chamei a classe TimeUnit para converter para dias o valor diff que estava em milissegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates (Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		} 
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", Check-in: "
				+ fmt.format(checkIn)
				+ ", Check-out: "
				+ fmt.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
 	}

}
