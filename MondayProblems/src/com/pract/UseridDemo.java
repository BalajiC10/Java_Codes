package com.pract;

public class UseridDemo {
public static void main(String[] args) {
	
			String input1 = "Rajiv";
			String input2 = "Roy";
			
			String res="";
			if(input1.length()>input2.length()) {
				res=input1.charAt(input1.length()-1)+input2;
			}
			
			else {
				res=input2.charAt(input2.length()-1)+input1;
			}
			
			if(input2.length()==input1.length()) {
				if(input1.compareTo(input2)<-1) {
					res=input2.charAt(input2.length()-1)+input1;
				}
				else {
					res=input1.charAt(input1.length()-1)+input2;
				}
			}
			
				int input3 = 561327;
				String str=""+input3;
				int input4=2;
				int index=input4-1;
				int l=0,r=0;
				int arr[]= new int[str.length()];
				
				for(int i=0; i<str.length(); i++) {
					arr[i]=(int)str.charAt(i)-48;
				}
	
					l  = arr[index];
					r = arr[arr.length-index-1];

			System.out.println(res);
			System.out.println(l);
			System.out.println(r);
			
			
			String ui = res;
			String re="";
			
				for(int i=0; i<ui.length(); i++) {
					
					
					if(Character.isUpperCase(ui.charAt(i))) {
						re+=Character.toLowerCase(ui.charAt(i));
					}
					
					else if(Character.isLowerCase(ui.charAt(i))) {
						re+=Character.toUpperCase(ui.charAt(i));				
					}
					
				}
			
			System.out.println(re+l+r);
	
}
}
