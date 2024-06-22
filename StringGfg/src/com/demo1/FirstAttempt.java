package com.demo1;

public class FirstAttempt {
	public static void main(String[] args) {

		int arr[] = { 3, 5, 6 };
		int arr1[] = { 2, 2, 3 };
		int in = 5;
		int mincand = arr[0];
		int minorg = arr1[0];
		int moves = 0;

		for (int element : arr) {
			if (mincand > element) {
				mincand = element;
			}

		}
		for (int element : arr1) {
			if (minorg > element) {
				minorg = element;
			}
		}

		for (int i = 0; i < 3; i++) {

			while (mincand != arr[i] || minorg != arr1[i]) {

				if (arr[i] != mincand) {
					arr[i]--;
				}
				if (arr1[i] != minorg) {
					arr1[i]--;
				}
				moves++;
			}

		}
		System.out.println(moves);
	}
}
