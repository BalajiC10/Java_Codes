package com.demo1;

public class Demo {
	public static void main(String[] args) {

		String input1 = "wipro";
		String input2 = "limited";

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		int count = 0;

		for (char ch = 'a'; ch < 'z'; ch++) {

			if (input1.indexOf(ch) != -1 && input1.indexOf(ch) != -1) {
				count++;

			}

			else {
				if (input1.indexOf(ch) != -1) {
					sb.append(ch);
				}
				if (input2.indexOf(ch) != -1) {
					sb1.append(ch);
				}

			}
		}
		System.out.println(count);
		System.out.println(sb1);
		int sum = 0;
		for (int i = 0; i < sb.length(); i++) {

			sum += sb.charAt(i) - 96;
		}

		int sum1 = 0;
		for (int i = 0; i < sb1.length(); i++) {
			sum1 += sb1.charAt(i) - 96;
		}

		System.out.println(sum1);

		StringBuilder pin = new StringBuilder();
		pin.append(count).append(sum).append(sum1);
		String res = pin.toString();

		System.out.println(Integer.parseInt(res));

	}
}
