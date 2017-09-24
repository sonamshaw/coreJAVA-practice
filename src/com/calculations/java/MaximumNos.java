package com.calculations.java;

public class MaximumNos {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 4, 7, -9, 5 };
		// int maxIndex = 0;
		// for (int i = 1; i < a.length; i++) {
		// if (a[i] > a[maxIndex]) {
		// maxIndex = i;
		// }
		// }
		// System.out.println(a[maxIndex]);
		int minValue=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<minValue){
				minValue=a[i];
			}
		}
		System.out.println(minValue);
		int maxValue=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>maxValue){
				maxValue=a[i];
			}
		}
		System.out.println(maxValue);
	}
}
