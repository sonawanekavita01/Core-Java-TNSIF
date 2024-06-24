package com.tnsif.daySix.SingleInheritance;

public class SinglelevelInheritance {
	

		public static void main(String[] args) {
			Person p1 = new Person(null, 0);
			// System.out.println(p1.toString());
			System.out.println(p1); // calling toString() method

			Person p2 = new Person("Kavita", 10);
			System.out.println(p2);

			Student st1 = new Student("Kavita", 10, 5);
			System.out.println(st1);

		}

	}

