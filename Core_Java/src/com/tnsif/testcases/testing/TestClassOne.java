package com.tnsif.testcases.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestClassOne {
	@ParameterizedTest
	@CsvSource({"4,24","5,120","0,1","-3,-1"})
	public void testForFactorial(int n,long expected) {
		long actual = Operations.getFactorial(n);
		Assertions.assertEquals(expected,actual);
	}
	
	@ParameterizedTest
	@ValueSource(ints= {5,7})
	public void testForPrimeNumbers(int n)
	{
		assertTrue(Operations.isprime(n));
	}
}
