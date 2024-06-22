package com.oops;

public class Circle extends Shape {

	public static void erase() {
		System.out.println("Erasing Circle");
	}
	public static void draw() {
		System.out.println("Drawing Circle");
	}
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s.erase();
	}
	
}
