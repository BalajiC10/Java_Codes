package com.basics;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
		String yn;
		do {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num: ");
		int no1=sc.nextInt();
		System.out.println("Enter Sec Num: ");
		int no2=sc.nextInt();
		System.out.println("Select Symbol(+,-,*,/)");
		String sym=sc.next();
		
		int res;
		
		switch(sym) {
		case "+":res=no1+no2;
				System.out.println("Addition is "+ res);
				break;
		case "-":res=no1-no2;
				System.out.println("Substraction is "+ res);
				break;
		case "*":res=no1*no2;
				System.out.println("Multiplication is "+ res);
				break;
		case "/":res=no1/no2;
				System.out.println("Divided by "+ res);
				break;
		default :System.out.println("Invalid symbol");
			break;
		}
		System.out.println("Do you want to continue(Press y for Yes and n for No)");
		yn=sc.next();
		}
		while(yn.equals("y") || yn.equals("Y"));
		
		
		
		
		
}
}
