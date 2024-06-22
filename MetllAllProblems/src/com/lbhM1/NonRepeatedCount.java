// 2package com.lbhM1;

// public class NonRepeatedCount {
	
// 	public static int CountNonRepeatNum(int input1) {
		
// 		int sum=0;
// 		int rem=0,count=0;
		
// 		if(input1>=0 || input1<=25000) {
			
// 			int arr[]= new int[10];
			
// 			while(input1!=0) {
// 				rem=input1%10;
// 				arr[rem]++;
// 				input1=input1/10;	
// 			}
			
// 			for(int i=0; i<=9; i++) {
// 				if(arr[i]==1) {
// 					count++;
// 				}
// 			}
			
// 		}
// 		return count;
		
// 	}
// public static void main(String[] args) {
	 
// 	System.out.println(CountNonRepeatNum(2923));

// }
// }