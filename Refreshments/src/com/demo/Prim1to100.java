package com.demo;

import java.util.ArrayList;

public class Prim1to100 {
public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=100; i++) {
			int temp=0;
			for(int j=2; j<i-1; j++) {
				if(i%j==0) {
					temp+=1;
				}
			}
			if(temp>0) {
				temp=0;
				//continue;
			}
			else {
				list.add(i);
			}
		}
		System.out.println(list);
}
}
