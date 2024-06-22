package com.hacker;

public class BeautifullDay {
	 public static int reverse(int n){
         int num = n;
         int sum=0;
         while(num!=0){
             int rem = num%10;
             sum=sum*10+rem;
             num/=10;
         }
         return sum;
     }
	 public static void main(String[] args) {
		 int i=20;
		 int j=23;
		 int k=6;
		 int count=0;
         for(int index=i; index<=j; index++ ){
        	 
             int rev = reverse(i);
             int ans = Math.abs(i-rev);
             
             if(ans%k==0){
                 count++;
             }
         }
         System.out.println(count); ;
	}
}
