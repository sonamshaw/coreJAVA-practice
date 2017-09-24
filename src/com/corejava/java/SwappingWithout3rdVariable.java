package com.corejava.java;

public class SwappingWithout3rdVariable {

	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1= "+num1+" "+"num2= "+num2);
		
		
	}

}
