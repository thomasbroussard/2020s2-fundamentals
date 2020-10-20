package fr.epita.geometry.datamodel;

public class Square {
	
	private double side;

	public Square(double i) {
		this.side = i;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double calculatePerimeter() {
		return this.side * 4;
	}
	
	public double calculateArea() {
		return this.side * this.side;
	}

}
