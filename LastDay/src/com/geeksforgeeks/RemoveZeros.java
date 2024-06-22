package com.geeksforgeeks;

public class RemoveZeros {
public static void main(String[] args) {
		
			String str = "000123";
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<str.length(); i++) {
				
				if(str.charAt(i)!='0') {
					
					sb.append(str.charAt(i));
				}
				else {
					
				}
			}
			System.out.println(sb);
}
}
