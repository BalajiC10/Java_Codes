package com.automobiles.twowheeler;

import com.automobiles.Vehicle;

public class Honda extends Vehicle{
	public static String a,b,c;
	   public static int d;
	   
	   
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return b;
	}
	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return c;
	}
	   public int getSpeed() {
		   return d;
	   }
	   
	   public void radio() {
		   System.out.println("It provides CD Player facility");
	   }
	   
	
}
