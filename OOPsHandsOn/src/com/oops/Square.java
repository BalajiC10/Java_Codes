package com.oops;

public class Square extends Shape {

	public static void erase() {
		System.out.println("Erasing Square");
	}
	public static void draw() {
		System.out.println("Drawing Square");
	}
	
	public static void main(String[] args) {
		Shape s = new Square();
		s.draw();
		s.erase();
		
		
	}
}
