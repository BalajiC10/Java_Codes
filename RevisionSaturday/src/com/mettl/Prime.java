package com.mettl;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=1; i<=100; i++) {
			int temp=0;
			for(int j=2; j<=i-1; j++) {
				
				if(i%j==0) {
					temp+=1;
				}
				
			}
			if(temp==0) {
				al.add(i);
				//System.out.println(i);
			}
			else {
				temp=0;
			}
		}
		System.out.println(al);
		
		
	}
}
