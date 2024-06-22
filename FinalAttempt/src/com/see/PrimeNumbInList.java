package com.see;
import java.util.*;
public class PrimeNumbInList {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
		
	for(int i=1; i<=100; i++) {
		int temp=0;
		for(int j=2; j<=i-1;j++) {
			if(i%j==0) {
				temp+=1;
			}
		}
		if(temp==0) {
			list.add(i);
		}
		else {
			temp=0;
		}
	}
	
	System.out.println(list);
}
}
