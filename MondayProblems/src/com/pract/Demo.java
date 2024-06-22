
package com.pract;

public class Demo {
public static void main(String[] args) {
	int pin = 560037;
	String str=""+pin;
	int pos=6;
	int index=pos-1;
	int l=0,r=0;
	int arr[]= new int[str.length()];
	
	for(int i=0; i<str.length(); i++) {
		
		arr[i]=(int)str.charAt(i)-48;
	}

	l = arr[index];
	r = arr[arr.length-index-1];
	
	
	System.out.println(l);
	System.out.println(r);
}
}
