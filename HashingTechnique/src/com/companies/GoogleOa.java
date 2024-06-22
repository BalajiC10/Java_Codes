package com.companies;
import java.util.*;
public class GoogleOa {
public static void main(String[] args) {
		
		int a[]= {2,5,8,7};
		int b[]= {1,3,5,8};
		
		int x=0,y=0;
		int c,d;
		int count=0;
		
		List<List<Integer>> list = new ArrayList<>();
		
		List<Integer> sub = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<b.length; j++) {
				x =a[i]-b[i];
				sub.add(a[i]);
				sub.add(b[i]);
				if(x!=0) {
					System.out.println(x);
					list.add(sub);
					break;
				}
			}
		}
		System.out.println(sub);
}
}
