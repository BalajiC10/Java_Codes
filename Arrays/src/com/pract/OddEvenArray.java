package com.pract;
import java.util.*;
public class OddEvenArray {
public static void main(String[] args) {
	
	int a[]= {8,5,10,12,3,1,4};
	ArrayList<Integer > al1 = new ArrayList<>();
	ArrayList<Integer > al2 = new ArrayList<>();
	
	for(int i=0; i<a.length; i++) {
		
		if(a[i]%2==0) {
			al1.add(a[i]);
		}
		else {
			al2.add(a[i]);
		}
	}
	System.out.println("Even Numbers: ");
	int total1=0;
	for(int no:al1) {
		total1=total1+no;
		System.out.print(no+" ");
	}
	
	int total2=0;
	System.out.println("\nOdd Numbers: ");
	for(int nu:al2) {
		total2=total2+nu;
		System.out.print(nu+" ");
	}
	
	
	System.out.println("\nSum of all even no: "+total1);
	System.out.println("Sum of all Odd no: "+total2);
	
}
}
