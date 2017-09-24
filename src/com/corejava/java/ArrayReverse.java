package com.corejava.java;

public class ArrayReverse {

	public static void main(String[] args) {
		int array[] = { 7, 3, 1, 4, 9, 2 };
		int n = array.length;
		int temp;
		// start point
		int start = 0;
		// end point
		int end = n - 1;
		while (start < end) {
			while (end > start) {
				temp = array[start];
				array[start] = array[end];
				array[end] = temp;

				start++;
				end--;

			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}

}
