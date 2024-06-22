package com.letsee;

public class Demot {
public static void main(String[] args) {
		String input1 = "AA01";
		//AA01
		String str = "AA98";
		//AB00
		
		char firstchar = input1.charAt(0);
		char secchar = input1.charAt(1);
		
		int lastsdigits = Integer.parseInt(input1.substring(2));
		System.out.println(lastsdigits);
				
		if(lastsdigits<99) {
			lastsdigits++;
		}
		
		else {
			if(secchar<'Z') {
				secchar++;
				lastsdigits=0;
			}
			else {
				if(firstchar<'Z') {
					firstchar++;
					secchar='A';
					lastsdigits=0;
				}
				else {
					firstchar ='A';
					secchar='A';
					lastsdigits=0;
				}
				
			}
			
		}
	System.out.println(String.valueOf(firstchar)+String.valueOf(secchar)+String.format("%02d", lastsdigits));
}
}
