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
	System.out.println("Factorial testing");
	long expected=1;
	long actual =Operations.getFactorial(-2);
	Assertions.assertEquals(expected,actual);
}
@Test
public void testFactorialForZero() {
	System.out.println("Factorial testing");
	long expected=1;
	long actual =Operations.getFactorial(0);
	Assertions.assertEquals(expected,actual);
}


}