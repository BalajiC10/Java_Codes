package com.easyproblemsStrings;

public class UserIdgeneration {
public static void main(String[] args) {
	
			String input1 = "Roy";
			String input2= "Rajiv";
			int pin = 560037;
			int pos=6;
			int n=pos-1;
			
			//yRajiv75
			String res= "";
			
			if(input1.length()<input2.length()) {
				res=input1.charAt(input1.length()-1)+input2;
				
			}
			else {
				res+=input2.charAt(input2.length()-1)+input1;
			}
			
			
			String pn = ""+pin;
			int arr[]= new int[pn.length()];
			
			for(int i=0; i<pn.length(); i++) {
				arr[i]=(int)(pn.charAt(i)-48);
			}
			int lp = arr[n];
			int ep = arr[arr.length-n-1];
			
			
			//String res =sb.toString();
			String ses= "";
			for(int i=0; i<res.length(); i++) {
				char ch = res.charAt(i);
				
				if(Character.isLowerCase(res.charAt(i))) {
					ses+=Character.toUpperCase(res.charAt(i));
				}
				if(Character.isUpperCase(res.charAt(i))) {
					ses+=Character.toLowerCase(res.charAt(i));
				}
				
			}
			StringBuilder sb1 = new StringBuilder(ses);
			sb1.append(lp);
			sb1.append(ep);
			sb1.toString();
			System.out.println(sb1);
}
}
