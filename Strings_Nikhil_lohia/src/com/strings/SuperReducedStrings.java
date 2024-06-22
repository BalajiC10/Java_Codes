package com.strings;
import java.util.*;
public class SuperReducedStrings {
public static void main(String[] args) {
	
			String str = "aaabccddd";
			
			Stack<Character> stack = new Stack<>();
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(stack.isEmpty()) {
					stack.push(ch);
				}
				else if(ch == stack.peek()) {
					stack.pop();
				}
				else {
					stack.push(ch);
				}
			}
			
			System.out.println(stack);
			
			StringBuilder sb = new StringBuilder();
			for(Character cr:stack) {
				sb.append(cr);
			}
			System.out.println(sb.toString());
}
}
