package com.strings;
import java.util.*;
public class BalancedBrackets {
public static void main(String[] args) {
	
			String str = "{}";
			
			Stack<Character> stack = new Stack<>();
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				
				if(ch=='{' || ch=='(' || ch== '[') {
					stack.push(ch);
					continue;
				}
				
				if(stack.isEmpty()) {
					
                    //System.out.println("No");
					
					char pop = stack.pop();
					
					if(stack.contains('{')) {
						stack.pop();
					}
					if(pop=='}' && ch!='{' ) {
						System.out.println("No");
					}
					if(pop==')' && ch!='(' ) {
						System.out.println("No");
					}
					if(pop==']' && ch!='[' ) {
						System.out.println("No");
					}
						}
				}
				
			
				if(stack.isEmpty()) {
						System.out.println("Balanced");
							}
					else {
							System.out.println("Not balanced");
							}
				System.out.println(stack);
}
}
