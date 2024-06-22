package com.test;

public class Demot2 {
public static void main(String[] args) {
		
			int input1 = 123;
			int input2 = 345;
			int input3 = 678;
			int input4 = 910;
			
			String str = ""+input1+input2+input3+input4;
			//System.out.println(str);
			
			int arr[]= new int[10];
			for(int i=0; i<str.length(); i++) {
				arr[str.charAt(i)-48]++;
			}
			
			int k=0;
			int min=arr[0];
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]<=min) {
					min=arr[i];
					System.out.println(min);
					k=i;
					System.out.println(k);
					break;
				}
				
			}
			
}
}
