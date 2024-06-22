package com.oops;

public class Shape {

	public static void erase() {
		System.out.println("Erasing shape");
	}
	public static void draw() {
		System.out.println("Drawing shape");
	}
	
	
	public static void main(String[] args) {
		
		Shape c = new Circle();
		c.draw();
		c.erase();
	}
}



