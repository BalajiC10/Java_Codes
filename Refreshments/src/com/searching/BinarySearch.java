package com.searching;

public class BinarySearch {
public static void main(String[] args) {
	
		int arr[]= {10,20,30,40,50,60,70};
		int item = 50;
		
		int li = 0;
		int hi=arr.length-1;
		int mi = (li+hi)/2;
		
		while(li<=hi) {
			
				if(arr[mi]==item) {
					System.out.println("element is at "+(mi+1)+" index position");
					break;
				}
				else if(arr[mi]<item) {
					li=mi+1;
				}
				else {
					hi=mi-1;
				}
				mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("not found");
		}
		
}
}
