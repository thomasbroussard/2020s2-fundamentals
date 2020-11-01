package fr.epita.geometry.datamodel;

public class Rectangle {
	
	private double height;
	private double width;
	
	
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calculateArea() {
		return this.width * this.height;
	}

	public double calculatePerimeter() {
		return this.width * 2 + this.height *2;
	}
}
