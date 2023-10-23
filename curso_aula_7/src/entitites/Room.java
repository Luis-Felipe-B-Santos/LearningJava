package entitites;

public class Room {
	
	private double rent;
	private String name;
	private String email;
	private int roomNumber;
	
	public Room(double rent, String name, String email, int roomNumber) {
		super();
		this.rent = rent;
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Rent price: $" + rent + 
				", Student name: " + name + 
				", Studen email: " + email + 
				", room number: " + roomNumber;
	}

}
