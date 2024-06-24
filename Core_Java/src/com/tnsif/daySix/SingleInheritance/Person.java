package com.tnsif.daySix.SingleInheritance;

public class Person {
	protected String name;
	private int age;

	public Person(String string, String string2) {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
