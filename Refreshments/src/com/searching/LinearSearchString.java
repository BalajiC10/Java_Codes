package com.searching;

public class LinearSearchString {
public static void main(String[] args) {
	
		String arr[]= {"Balaji", "Ram", "Rushi","Vasu", "Sarish"};
		String srch= "Ram";
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			if(srch.equals(arr[i])) {
				System.out.println(srch+" present at position at "+i);
				temp+=1;
			}
		}
		if(temp==0) {
			System.out.println("not found");
		}
}
}
