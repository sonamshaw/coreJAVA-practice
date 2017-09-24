package com.corejava.java;

public class Overloading {
	static int add(int a, int b){
		return (a+b);
	}
	static int add(int a,int b,int c){
		return(a+b+c);
	}

	public static void main(String[] args) {
		Overloading ov=new Overloading();
		int result1=ov.add(101, 102);
		int result2=ov.add(101, 102, 100);
		System.out.println(result1);
		System.out.println(result2);
	}
}
