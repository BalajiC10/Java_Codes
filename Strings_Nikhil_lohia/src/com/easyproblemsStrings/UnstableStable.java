package com.easyproblemsStrings;

import java.util.Arrays;

public class UnstableStable {
	
public static void main(String[] args) {
	
	int arr[]= {12,1313,122,678,898};
	
	int unstable=0,stable=0;
	
	for(int i=0; i<arr.length; i++) {
		int flag =0;
		int num = arr[i];
		int temp,max=0; 
		int brr[]= new int[10];
		temp=arr[i];
		//Arrays.fill(brr, 0);
		
		while(temp>0) {
			brr[temp%10]++;
			temp/=10;
		}
		
		max=brr[0];
		//System.out.println("brro "+ brr[0]);
		for(int j=0; j<brr.length; j++) {
//			if(brr[j]>max) {
//				max=brr[j];
//			}
			max = Math.max(brr[j], max);
		}
		
		//System.out.println("brr" + max);
		
		for(int k=0; k<brr.length; k++) {
			if(max==brr[k] || brr[k]== 0) {
				continue;
			}
			else {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			unstable+=num;
			//System.out.println(unstable);
		}
		else {
			stable+=num;
			//System.out.println(stable);
		}
	}
	System.out.println(stable);
	System.out.println(unstable);
	System.out.println(Math.abs(stable-unstable));

	
	
}

}
