package com.demo1;

public class ReverseWord {
	public static void main(String[] args) {

		String str = "My name is Balaji";
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}

		System.out.println(s);
	}
}
