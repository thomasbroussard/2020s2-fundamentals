package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Square;

public class Launcher {
	
	public static void main(String[] args) {
		Square square = new Square(4);
		System.out.println("for this square with side : " + square.getSide() + "we get those characteristics");
		System.out.println(square.calculateArea());
		System.out.println(square.calculatePerimeter());
	}

}
