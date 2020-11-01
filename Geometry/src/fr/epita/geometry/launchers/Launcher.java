package fr.epita.geometry.launchers;

import java.util.Arrays;
import java.util.List;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Square;

public class Launcher {
	
	public static void main(String[] args) {
		Square square1 = new Square(4);
		System.out.println("for this square with side : " + square1.getSide() + "we get those characteristics");
		System.out.println(square1.calculateArea());
		System.out.println(square1.calculatePerimeter());
		
		Square square2 = new Square(2);
		Square square3 = new Square(6);
		
		
//		double area = square1.calculateArea() + square2.calculateArea() + square3.calculateArea();
//		
//		Square[] squares = new Square[] {square1,square2,square3};
//		Square[] squares2 = new Square[3];
//		squares2[0]= square1;
//		squares2[1]= square2;
//		squares2[2]= square3;
		
		
		double areaFromList = 0;
		List<Square> squaresAsList = Arrays.asList(square1,square2,square3);
		
		for(Square figure : squaresAsList) {
			areaFromList += figure.calculateArea();
		}
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(6);
		Circle c3 = new Circle(9);
		List<Circle> circles = Arrays.asList(c1,c2,c3);
		
		for(Circle figure : circles) {
			areaFromList += figure.calculateArea();
		}
		
		areaFromList = 0;
		List<Shape> shapes = Arrays.asList(square1,square2,square3, c1,c2,c3);
		for(Shape figure : shapes) {
			areaFromList += figure.calculateArea();
		}
		
		Square square10 = new Square(10);
		square10.get
		
		
		
		
		
	}

}
