package com.array;

public class ArraySum {
public static void main(String[] args) {
	
		int a[]= {10,20,30,40,50};
		
		int temp=0; 
		for(int i=0; i<a.length; i++) {
			temp+=a[i];
		}
		System.out.println(temp);
}
}
