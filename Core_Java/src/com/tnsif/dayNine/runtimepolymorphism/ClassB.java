package com.tnsif.dayNine.runtimepolymorphism;

public class ClassB extends ClassA {
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void show() {
		System.out.println("Name - "+name);
	}

}