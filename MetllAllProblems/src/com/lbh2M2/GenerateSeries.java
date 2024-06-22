package com.lbh2M2;

public class GenerateSeries {
public static void main(String[] args) {
	
	int arr[]= new int[14];
	
	arr[0]=1;
	arr[1]=3;
	arr[2]=6;
	int evenDiff=arr[1]-arr[0];
	System.out.print(evenDiff+" ");
	
	int oddDiff=arr[2]-arr[1];
	System.out.print(oddDiff+" ");
	
	//1,3,6
	//0,1,2,3
	for(int i=3; i<arr.length; i++) {
		if(i%2!=0) {
			arr[i]=arr[i-1]+evenDiff;
		}
		else {
			
			arr[i]=arr[i-1]+oddDiff;
		}
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println(arr[arr.length-1]);
	
	
}
}
