package com.tnsif.dayNinenteen;

public class PalindromeClass{

	//generic method
	<T>void display(T t) {
		System.out.println("You entered : "+t);
		System.out.println("Typeis : "+t.getClass());
		
	}
	<T> boolean checkPalindrome(T t)
	{
		System.out.println(t.getClass().getName().equals("java.lang.String"));
	
		return false;
		

	}
}
