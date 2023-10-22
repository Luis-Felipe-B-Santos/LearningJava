package entities;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public double areaCalculator() {
		double p = (this.sideA + this.sideB + this.sideC) / 2.0;
		return Math.sqrt(p + (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
	}
	
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
}
