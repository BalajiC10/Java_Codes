package com.test;

public class AA00 {
public static void main(String[] args) {
		
			String input1 = "AA12";
			//BC02
			
			char firstChar = input1.charAt(0);
			char secChar = input1.charAt(1);
			int lastDigits = Integer.parseInt(input1.substring(2));
			
			System.out.println(lastDigits);
			
			if(lastDigits<99) {
				lastDigits++;
			}
			
			else {
				if(secChar<'Z') {
					secChar++;
					lastDigits=0;
				}
				else {
					
					if(firstChar<'Z') {
						firstChar++;
						secChar='A';
						lastDigits=0;
						
					}
					else {	
							firstChar = 'A';
							secChar = 'A';
							lastDigits=0;			
					}
				}
			}
			//System.out.println(Integer.toString(firstChar)+Integer.toString(secChar)+String.format("%02d", lastDigits));
			String res = ""+firstChar+secChar+String.format("%02d",lastDigits);
			System.out.println(res);
}
}
