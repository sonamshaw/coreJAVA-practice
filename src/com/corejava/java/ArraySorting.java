package com.corejava.java;

public class ArraySorting {
	
	public static void main(String[] args) {
		int numArray[]={1,3,2,9,4,6,11,28};
		for(int i=0;i<numArray.length;i++){
			for (int j = i + 1; j < numArray.length; j++) {
	            int temp = 0;
	            if (numArray[i] > numArray[j]) {
	                temp = numArray[i];
	                numArray[i] = numArray[j];
	                numArray[j] = temp;
	            }
	        }
		
		}
		for(int i=0;i<numArray.length;i++){
		System.out.println(numArray[i]);	
		}	
		
	}

}
