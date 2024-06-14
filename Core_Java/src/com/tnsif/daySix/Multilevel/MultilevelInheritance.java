package com.tnsif.daySix.Multilevel;



public class MultilevelInheritance {

	public static void main(String[] args) {
		
		ClassA a1 = new ClassA();
		a1.show();
		System.out.println("------------------------------------------");
		
		ClassA a2 = new ClassA(10);
		a2.show();
		System.out.println("------------------------------------------");
		
		ClassB b1 = new ClassB();
		b1.show();
		System.out.println("******************************************");
		
		ClassB b2 = new ClassB(1, "Kavita");
		b2.show();
		System.out.println("******************************************");
		
		ClassC c1 = new ClassC();
		c1.show();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		ClassC c2 = new ClassC(2, "Ritika", 70.45f);
		c2.show();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
	}

}