package com.corejava.java;

public class Person {
	
	private String name;// instance variable
	private int age;
	private int id;

	public Person(String name) {
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person person) {

		System.out.println(getName() + " said Hello To " + person.getName());
	}
}
