package com.demo;
import java.util.*;
public class GoogleOa {
public static void main(String[] args) {
		
				int arr[]= {1,2,1,0,1,1,0};
				int k=4;
				
				//[1,2 ]= 2,5
				
				List<List<Integer>> list = new ArrayList<>();
				
				for(int i=0; i<arr.length;i++) {
					
					for(int j=0; j<arr.length; j++) {
						int sum=0;
						List<Integer> sub = new ArrayList<>();
						List<Integer> idx = new ArrayList<>();
						for(int index=i; index<=j; index++) {
							sum+=arr[index];
							sub.add(arr[index]);
							idx.add(index+1);
			
				}
				 if(sum<=k ) {
							list.add(idx);
							
						}
					}
				}
				
			
			
			for(List<Integer> mm:list) {
				System.out.println(mm);
				
			}
			
			}
			

}
