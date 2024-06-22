package com.oops;

public class Box {
private  double width;
private double height;
private double depth;
public Box(double width, double height, double depth) {
	super();
	this.width = width;
	this.height = height;
	this.depth = depth;
}

public static double volumeBox(double width, double height, double depth) {
	
	 double res =(width*height*depth);
	 return res;
}

public static void main(String[] args) {
	
System.out.println(Box.volumeBox(10,10,10));	
}
}
