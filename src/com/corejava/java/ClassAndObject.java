package com.corejava.java;


public class ClassAndObject {
	public static void main(String[] args) {

		Person john = new Person("John");
		Person bob = new Person("Bob");
		john.setAge(20);
		bob.setAge(25);
		System.out.println(john.getName() + " is " + john.getAge() + " years old");
		System.out.println(bob.getName() + " is " + bob.getAge() + " years old");
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
}
}
