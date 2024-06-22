package com.demo;
public class CountPairsArraySumLTK {
public static void main(String[] args) {
			
			int arr[]= {1,3,9,10,11,5,2,3,3,2};
			int k=4;
			
			int s=0; 
			int e =arr.length-1;
			int ans=0;
			
			while(s<e) {
				
				if(arr[s]+arr[e]==k) {
					ans++;
					s++;
				}
				else {
					e--;
				}
			}
			System.out.println(ans);
}
}
