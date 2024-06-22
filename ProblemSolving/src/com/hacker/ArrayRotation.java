package com.hacker;

public class ArrayRotation {
public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int t=4;
		int k=arr.length-t-1;
		
		String res="";
		for(int i=0; i<arr.length; i++) {
			res+=arr[i];
		}
		
		String str="";
		
		System.out.println(res.substring(k+1)+res.substring(0,k+1));
		
		
}
}
