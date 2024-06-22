package com.automobiles.twowheeler;

import com.automobiles.Vehicle;
import java.util.*;
public class Hero extends Vehicle {
	public static String a,b,c;
   public static int d;
   
   public void Hero() {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Model Number");
	   a=sc.nextLine();
	   System.out.println("Enter Regi Number");
	   b=sc.nextLine();
	   System.out.println("Enter Owner Name");
	   c=sc.nextLine();
	   
	   System.out.println("Enter Speed");
	   d=sc.nextInt();
	   System.out.println("Output...");
	   
   }

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
	   System.out.println("It provides radio facility");
   }
	
}
