package com.tnsif.dayNine.runtimepolymorphism;


public class Person {

	private String name;
	private String city;
	
	public Person() {
		super();
	}
	
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

}