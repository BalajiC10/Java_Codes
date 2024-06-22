package com.pract;
import java.util.*;
public class PrimeNum {
public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=2; i<=100; i++) {
			int count=0;
			for(int j=2; j<i-1; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				list.add(i);
			}
			else {
				count=0;
			}
		}
		System.out.println(list);
		
}
}
