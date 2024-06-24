package com.tnsif.dayNine.runtimepolymorphism;

import com.tnsif.daySix.SingleInheritance.Person;

public class OverridingDemo {

	public static void main(String[] args) {
		
		ClassA obj;
		
		obj=new ClassA();
		obj.setN(10);
		obj.show(); //show() of ClassA
		
		obj=new ClassB();
		obj.setN(20);
		obj.show(); //show() of ClassB
		
		ClassB bObj=new ClassB();
		bObj.setName("Kavita");
		bObj.show();
		
		Person person = new Person("Kavita","Nashik");
		Student student=new Student(100,"IT","Dhaniii","Pune");
		
		System.out.println(person);
		System.out.println(student);
	}

}