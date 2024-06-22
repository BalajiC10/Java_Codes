package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
/*
 * Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.

This program may generate Array Index Out of Bounds Exception or

NumberFormatException. Use exception handling mechanisms to handle this exception.

Sample Input and Output 1: Enter the number of elements in the array

2 Enter the elements in the array

58 88

Enter the index of the array element you want to access

The array element at index 1 = 88 The array element successfully accessed

 */
	
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
