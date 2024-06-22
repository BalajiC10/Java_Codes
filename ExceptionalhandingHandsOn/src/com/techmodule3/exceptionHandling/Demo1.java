package com.techmodule3.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the "+n+" elements in the array: ");
		try {
		for(int i=0; i<=n; i++) {
				arr[i]=sc.nextInt();
				System.out.println("Enter the index of the array element you want to access\n");
				int index = sc.nextInt();
				System.out.println("The array element at index "+index+" = "+ arr[index]);
				System.out.println("The array element successfully accessed ");
		}
		
		
		}	
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			
		}
		catch(InputMismatchException e){
			System.out.println("java.lang.InputMismatchException");
			
		}
				
				
		
	}
	
}
