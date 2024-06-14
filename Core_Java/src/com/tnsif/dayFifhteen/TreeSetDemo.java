package com.tnsif.dayFifhteen;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> courseSet = new TreeSet<String>();
		courseSet.add("Java");
		courseSet.add("C++");
		courseSet.add("Python");
		courseSet.add("C");
		courseSet.add("React");
		courseSet.add("Angular");
		System.out.println(courseSet);
		System.out.println("First Course :" + courseSet.first());	
		System.out.println("Last Course :" + courseSet.last());	
		
		//Remove Course c if present
		courseSet.remove("C");
		System.out.println(courseSet);
		//remove first element
		courseSet.pollFirst();
		System.out.println(courseSet);
		//remove last element
		courseSet.pollLast();
		System.out.println(courseSet);
		//courseSet.add(null);        throws NullPointerException
		System.out.println("-----------------------------------------------");

		//Sort on ascending order of empId 
		
		//Comparator<Employee> comp =(e1,e2)->e1.getEmpId()-e2.getEmpId();
		//Sort on Descending order of salary 
		Comparator<Employee> comp =(e2,e1)->(int) (e1.getSalary() -e2.getSalary());
		TreeSet<Employee> empSet = new TreeSet<Employee>(comp);
		empSet.add(new Employee(101,"Prathmesh",730000));
		empSet.add(new Employee(104,"Sharad",620000));
		empSet.add(new Employee(102,"Ram",810000));
		empSet.add(new Employee(106,"Ankita",780000));
		empSet.add(new Employee(103,"Nandini",630000));
		//empSet.add(123);
		System.out.println("Employee details :\n" + empSet);
		
		
		
		
		
		
		
}}
