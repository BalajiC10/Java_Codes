package com.demo;

public class GetCodeThroughStrings {
public static void main(String[] args) {
	
	
		String input1 = "Wipro Banglore";
		
		String[] str = input1.split(" ");
		int sum=0,no=0;
		for(int i=0; i<str.length;i++) {
			sum+=str[i].length();
		}
		if(sum<=9) {
			System.out.println(sum);
		}
		else {
			int res = digitsum(sum);
			System.out.println(res);
		}
			
		}

	static int digitsum(int sum) {
		
		int num =sum;
		sum =0;
		
		while(num>0){
			sum+=num%10;
			num/=10;
		}
		if(sum>9) {
			return digitsum(sum);
		}
		else {
			return sum;
		}
 }
}
