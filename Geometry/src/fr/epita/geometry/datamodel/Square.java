package fr.epita.geometry.datamodel;

public class Square implements Shape{
	
	private Rectangle rectangle;
	
	public Square(double i) {
		this.rectangle = new Rectangle(i, i);
	}

	public double getSide() {
		return this.rectangle.getWidth();
	}

	public void setSide(double side) {
		this.rectangle.setHeight(side);
		this.rectangle.setWidth(side);
	}

	@Override
	public double calculateArea() {
		return this.rectangle.calculateArea();
	}

	@Override
	public double calculatePerimeter() {
		return this.rectangle.calculatePerimeter();
	}
	
	

}
