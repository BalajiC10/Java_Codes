package com.series;

public class Demo3 {
public static void main(String[] args) {
	
		double sum=0;
		for(int i=9; i<=9; i+=2) {
			System.out.print(i+" ");
			sum+=sum+Math.pow(i, 2);
		}
		System.out.println(sum);
}
}
