package entities;

import entities.enums.Color;

public abstract class Shape {
	private Color color;

	public Shape() {
		
	}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}



	public abstract double area();
	// o metodo é vazio pois Formas é uma classe muito abstrata
	// a area de uma forma muda de acordo com a forma
	//por isso, faz mais sentido especificar com um @Override dentro da classe da forma especifica
	
}
