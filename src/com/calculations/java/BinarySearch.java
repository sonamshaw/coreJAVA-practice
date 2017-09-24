package com.calculations.java;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int n = array.length - 1;
		int mid;
		int first = 0;
		int last = n;
		int num = 2;

		
		mid = (first + last) / 2;

		while (first <= last) {
			if (num> array[mid])
				first = mid + 1;
			else if (array[mid] == num) {
				System.out.println(num + " found at location " + (mid) + ".");
				break;
			} else
				last = mid - 1;

			mid = (first + last) / 2;
		}
		if (first > last)
			System.out.println(num + " is not present in the list.");
	}

}
