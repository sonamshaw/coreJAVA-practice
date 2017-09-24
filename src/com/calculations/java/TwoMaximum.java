package com.calculations.java;

public class TwoMaximum {
	public static void main(String[] args) {
		int array[] = { 15, 7, 4, 22 , 9, 0 };
		int largest1 = 0;
		int largest2 = 0;
		if(array[0]>array[1]){
			largest1=array[0];
			largest2=array[1];
		}else{
			largest1=array[1];
			largest2=array[0];
		}
		for (int i = 2; i < array.length; i++) {
			if (array[i] > largest1) {
				largest2 = largest1;
				largest1 = array[i];
				
			}
			if ((array[i] > largest2) && (array[i] < largest1)) {
				largest2 = array[i];
			}
		}

		System.out.println(largest1);
		// for(int i=0;i<array.length-1;i++){
		// if(array[i]>largest2){
		// largest2=array[i];
		// }
		// }
		System.out.println(largest2);
	}
}
