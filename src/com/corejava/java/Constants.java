package com.corejava.java;


public class Constants {

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final Person P1 = new Person("");// value in p1 reference
													// variable is final which
													// is immutable and p1 can't
													// refer any other object
	public static final int TRASANCATION_Amount = 5000;

	public static void main(String[] args) {
		// All constants are variables whose value can't be changed once it is
		// assigned
		// Usually static
		// by convention, constants are upper-case
		// declare constants by using the final modifier
		// constants can be public because there is no harm in accessing a
		// constant if you can't alter it
		System.out.println(Math.PI);
	}
}
