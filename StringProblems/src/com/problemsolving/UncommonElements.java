package com.problemsolving;

public class UncommonElements {
	
	public static int getSum(int sum) {
		
		int rem=0;
		int tum=0;
		
		while(sum>0) {
			rem=sum%10;
			tum=tum+rem;
			sum/=10;
		}
		return tum;
	}
	
public static void main(String[] args) {
	
	char input1[]= {'A','B','C'};
	char input2[]= {'B','C'};
	
	String str="";
	
	for(int i=0; i<input1.length; i++) {
		str+=input1[i];
	}
	for(int i=0; i<input2.length; i++) {
		str+=input2[i];
	}
	
   int sum=0;
	for(int i=0; i<str.length(); i++) {
		boolean un=true;
		for(int j=i; j<str.length(); j++) {
			
			if(i!=j && str.charAt(i)==str.charAt(j)) {
				un=false;	
			}
			
		}
		if(un==true) {
			sum=str.charAt(i);
			break;
		}
	}
	
	
	int n = getSum(sum);
	
	if(n>10) {
		System.out.println(getSum(n));
	}
	else {
		
		System.out.println(n);
	}
	
	
}
}
