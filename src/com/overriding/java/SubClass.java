package com.overriding.java;

public class SubClass extends Base {
	public static void main(String[] args) {
		SubClass s = new SubClass();
	}

	public SubClass() {
		//sayHello();
	}
	@Override
	public void sayHello() {
		
		//super.sayHello();
		System.out.println("Hi!");
	}
}
