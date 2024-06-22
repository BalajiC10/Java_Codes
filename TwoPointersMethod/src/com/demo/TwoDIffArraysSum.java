package com.demo;
import java.util.*;
public class TwoDIffArraysSum {
public static void main(String[] args) {
		
			int a[]= {1,4,5,7,5};
			int b[]= {10,20,30,40,30};
			
			int x=32;
			List<List<Integer>> list = new ArrayList<>();
			
			for(int i=0; i<a.length; i++) {
			
				for(int j=0; j<b.length; j++) {
					
					List<Integer> sub = new ArrayList<>();
					
					if(a[i]+b[i]<=x) {
						sub.add(a[i]);
						sub.add(b[i]);
						list.add(sub);
						break;	
					}
				}	
			}
			System.out.println(list);
}
}
