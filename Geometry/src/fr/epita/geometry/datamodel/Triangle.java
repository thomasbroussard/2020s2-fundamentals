package fr.epita.geometry.datamodel;

public class Triangle {
	private double sideA; 
    private double sideB;
    private double height;
    private double base;
    
	public double calculatePerimeter() {
		return this.sideA + this.sideB + this.base;
	}
	
	public double calculateArea() {
		return this.height * this.base / 2;
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

	public double getSideHeight() {
		return height;
	}

	public void setSideHeight(double sideHeight) {
		this.height = sideHeight;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

    
}
