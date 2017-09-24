package com.corejava.java;

public class LinearSearch {

	public static void main(String[] args) {
		int num = 7;
		int numbers[] = { 7, 9, 1, 3, 5, 4, 0, 2 };
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == num) {
				index = i;
				break;
			}

		}

		if (index != -1) {
			System.out.println("element found at index  " + index);
		} else {
			System.out.println("element not found");
		}
	}

}
