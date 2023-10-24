package entities;

public class Employee {
	private int id;
	private double salary;
	private String name;
	
	public Employee(int id, double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void raiseSalary(double raise) {
		this.salary += salary * raise;
	}

	@Override
	public String toString() {
		return "Employee id: " + id 
				+ ", name: " + name
				+ ", salary: $" + salary; 
				
	}
	
	
}
