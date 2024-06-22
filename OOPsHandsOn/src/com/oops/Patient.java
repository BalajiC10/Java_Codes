package com.oops;

public class Patient {
private String name;
private double height;
private double weight;

	public static void main(String[] args) {
		Patient ram = new Patient();
		System.out.println(ram.findBMI("Ram",10,50));
	}

	private static double findBMI(String name,double height,double weight) {
		// TODO Auto-generated method stub
		double res = (((weight)/(height*height))*703.0d);
		return res;
	}
}
