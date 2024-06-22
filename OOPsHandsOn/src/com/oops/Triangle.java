package com.oops;

public class Triangle extends Shape {

	public static void erase() {
		System.out.println("Erasing Triangle");
	}
	public static void draw() {
		System.out.println("Drawing Triangle");
	}
	public static void main(String[] args) {
		Shape t = new Triangle();
		t.draw();
		t.erase();
	}
}
