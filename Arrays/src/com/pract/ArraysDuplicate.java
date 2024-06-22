package com.pract;


//import java.util.LinkedHashSet;
import java.util.Set;

public class ArraysDuplicate {
	public static void main(String[] args) {
		int a[]= {1,1,3,5,4,3,2,3,1};
		int temp=0;
		
		for(int i=0; i<a.length; i++) {
				
				for(int j=i+1; j<a.length; j++ ) {
					if(a[i]==a[j]) {
						temp=a[i];
					}
					
				}
		}
		System.out.println(temp);
	}
}
