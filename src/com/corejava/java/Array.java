package com.corejava.java;

public class Array {
	public static void main(String[] args) {
		int x;//creating one box in memory that store one int value
		int [] myArray;//declaring an array that will store int
		myArray=new int[50000];// initializing our array to be capable of holding 4 ints  
//		myArray[0]=1;
//		myArray[4]=5;
//		myArray[3]=3;
//		myArray[1]=9;
//		myArray[2]=7;
//		for (int i=0;i<myArray.length;i++){
//			System.out.println(myArray[i]);
//		}
		for (int counter=0; counter<myArray.length;counter++){
			myArray [counter]=counter;
		}
		for (int number:myArray){
			System.out.println(number);
		}
	}

}
