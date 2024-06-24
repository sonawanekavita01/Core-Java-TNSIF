package com.tnsif.dayNinenteen;

public class GenericMethodDemo {

	public static void main(String[] args) {
	PalindromeClass obj = new PalindromeClass();
	obj.display(10);
	obj.display("PVG");
	obj.display(true);
	obj.display(45.60);
	
	PalindromeClass intobj = new PalindromeClass();
	intobj.checkPalindrome("Hello");
	}

}
