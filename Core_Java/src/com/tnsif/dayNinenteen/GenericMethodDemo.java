package com.tnsif.dayNinenteen;

public class GenericMethodDemo {

	public static void main(String[] args) {
	PalindromeClass obj = new PalindromeClass();
	obj.display(10);
	obj.display("PVG");
	obj.display(true);
	obj.display(45.60);
	
	
	System.out.println("is 10 Palindrome ?: "+ obj.checkPalindrome(10));
	System.out.println("is 101 Palindrome ?: "+ obj.checkPalindrome(101));
	System.out.println("is CAR Palindrome ?: "+obj.checkPalindrome("CAR"));
	System.out.println("is RACECAR Palindrome ?: "+obj.checkPalindrome("RACECAR"));
	 obj.checkPalindrome(10.67);
	
}

}
