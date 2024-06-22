package com.companies;

public class mircrosoft {
	public static int digitSum(int num) {
		
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int rem = temp%10;
			sum+=rem;
			temp/=10;
		}
		return sum;
	}
public static void main(String[] args) {
		
		//int arr[]= {51,71,17,42};
		//int arr[]= {51,71,17,42};
	
		int arr[]= {42,33,60};
		//find max digitsum whose pairs are max between them and add it
		
		int ans=0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(digitSum(arr[i])==digitSum(arr[j])) {
						//System.out.println(arr[i]+" "+arr[j]);
						sb.append(arr[i]+arr[j]);
						
						if((arr[i]+arr[j])>ans) {
							
							ans = Math.max(ans, (arr[i]+arr[j]));
							
						}
						
				}	
			}
			
		}
		System.out.println("max sum of two duplicate pairs: ");
		System.out.println(ans);
}
}
