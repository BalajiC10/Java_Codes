package com.demo;
import java.util.*;

public class IsPallidromePossible {
public static void main(String[] args) {
	
	int num = 19224;
	int arr[]= new int[10];
	int rem=0;
	int n=num;
	
	while(n>0) {
		rem=n%10;
		for(int i=0; i<=9; i++) {
			if(rem==i) {
				arr[i]++;
			}
		}
		n/=10;
		
	}
	
	for(int i=0; i<=9; i++) {
		
		if(arr[i]>0) {
			System.out.println(i +"-->"+arr[i]);
		}
	}
			
}
}
