package com.tnsif.testcases.testing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MyTestClass {
@Test
public void testAddition() {
	System.out.println("Addition testing");
	int expected=7;
	int actual=Operations.add(2,5);
	Assertions.assertEquals(expected,actual);
	
}
@Test
public void testFactorial() {
	System.out.println("Factorial testing");
	long expected=5040;
	long actual =Operations.getFactorial(7);
	Assertions.assertEquals(expected,actual);
}

@Test
public void testFactorialForNegativeNumbers() {
	System.out.println("Factorial fot Negative testing");
	long expected=-1;
	long actual =Operations.getFactorial(-2);
	Assertions.assertEquals(expected,actual);
}
@Test
public void testFactorialForZero() {
	System.out.println("Factorial  for Zero testing");
	long expected=1;
	long actual =Operations.getFactorial(0);
	Assertions.assertEquals(expected,actual);
}
@Test
public void testForPrime() {
	System.out.println("Prime Number  testing");
	Assertions.assertTrue(Operations.isprime(5));
}
@Test
public void testForNonPrime() {
	System.out.println(" Non-Prime Number  testing");
	Assertions.assertFalse(Operations.isprime(9));
}
@Test
public void testForNumberPalindrome() {
	System.out.println(" Palindrome Number  testing");
	Assertions.assertTrue(Operations.ispalindrome(12321));
}
@Test
public void testForNumberNonPalindrome() {
	System.out.println(" Non-Palindrome Number  testing");
	Assertions.assertFalse(Operations.ispalindrome(129));
}
@Test
public void testForStringPalindrome() {
	System.out.println("Palindrome String  testing");
	Assertions.assertTrue(Operations.ispalindrome("MAM"));
}

@Test
public void testForStringNonPalindrome() {
	System.out.println(" Non-Palindrome String  testing");
	Assertions.assertFalse(Operations.ispalindrome("CAR"));
}

}