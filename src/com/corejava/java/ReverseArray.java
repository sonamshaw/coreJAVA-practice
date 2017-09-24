package com.corejava.java;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 2, 4, 7, 3, 1 };

		int length = arr.length;
		int reverseArr[] = new int[length];
		int n = 0;
		for (int i = length - 1; i >= 0; i--) {
			reverseArr[n] = arr[i];
			n++;
		}
		for (int i = 0; i < length; i++) {
			System.out.println(reverseArr[i]);
		}

	}

}
