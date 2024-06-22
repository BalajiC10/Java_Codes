package com.demo1;

public class FirstCharOfWord {
	public static void main(String[] args) {

		String str = "I am Balaji";
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (ch[i] != ' ' && (i == 0 || ch[i - 1] == ' ')) {
				System.out.println(str.charAt(i));
			}
		}

	}
}
