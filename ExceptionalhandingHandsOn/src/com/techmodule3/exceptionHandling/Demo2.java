package com.techmodule3.exceptionHandling;

import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) throws ValuesOutOfRangeException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	for(int i=0; i<2; i++) {
		String name=null;
		int subA=60;
		int subB=70;
		int subC=80;
	try{
		
		  name=sc.nextLine();
		  
	      if(sc.hasNext()) {
		   subA=sc.nextInt();}
	      
	      
	      else {
		  throw new NumberFormatException();}
	
	      if(sc.hasNextInt()) {
			subB=sc.nextInt();
		   }
	      
		 else {
			throw new NumberFormatException();}
	      
	      
			if(sc.hasNextInt()) {
				subC=sc.nextInt();
			}
			else {
				throw new NumberFormatException();
			}
			
			if(subA<0) {
				throw new NegativeArraySizeException();
		     }
			if(subA>100) {
				 throw new ValuesOutOfRangeException();
			}
			if(subB<0) {
				throw new NegativeArraySizeException();
		    }
			if(subB>100) {
				 throw new ValuesOutOfRangeException();
			}
			if(subC<0) {
				throw new NegativeArraySizeException();
		    }
			if(subC>100) {
				 throw new ValuesOutOfRangeException();
			}
	        }
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(NegativeArraySizeException e1) {
				System.out.println(e1.getMessage());
			}
	        catch(ValuesOutOfRangeException e2) {
		       System.out.println(e2.getMessage());
	        } 
	
		System.out.println("Name: "+name);
		System.out.println("Marks of Subject A: "+subA);
		System.out.println("Marks of Subject B: "+subB);
		System.out.println("Marks of Subject C: "+subC);
	}
	sc.close();
	
}
}
