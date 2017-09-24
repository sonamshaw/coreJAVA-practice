package com.corejava.java;

public class StringReverse {

	public static void main(String[] args) {
		String compName="capegemini";
		char array[]=compName.toCharArray();
		int start=0;
		int end=array.length-1;
		char temp;
		while(end>start){
		temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		start++;
		end--;
		}
		for(int i=0;i<array.length;i++){
		System.out.print(array[i]);
		}
	}

}
