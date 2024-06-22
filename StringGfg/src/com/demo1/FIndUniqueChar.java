package com.demo1;

import java.util.*;

public class FIndUniqueChar {
	public static void main(String[] args) {

		String str = "bccbababd";

		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (char cm : set) {
			System.out.print(cm);
		}

	}
}
