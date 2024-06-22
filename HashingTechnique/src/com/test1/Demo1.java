package com.test1;

import java.util.Arrays;

public class Demo1 {
public static void main(String[] args) {
	int h[]= {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 ,5, 5, 5};
		//	  a, b, c, d ,e ,f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y ,z
	String word = "abc";
	
	int sum=0;
	StringBuilder sb = new StringBuilder();
	
	for(int i=0; i<word.length(); i++) {
		sum=word.charAt(i)-96;
		System.out.println(sum);
		
		int flag=sum-1;
		for(int j=0; j<h.length;) {
			sb.append(h[flag]);
			break;
		}
	}
	
	
	int len = sb.length();
	
	String car = sb.toString();
	
	int temp[]= new int[car.length()];
	int max=0;
	
	for(int i=0; i<car.length(); i++) {
		temp[i]=car.charAt(i)-48;
		
		max = Math.max(max, temp[i]);
	}
	System.out.println(max);
	int ans = max*len;
	System.out.println(ans);
			
 }
}
