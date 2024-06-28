package com.tnsif.testcases.testing;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
//@TestInstance(Lifecycle.PER_METHOD)
@TestInstance(Lifecycle.PER_CLASS)
//Disabled
public class LifeCycleTestClass {
//@Test
@RepeatedTest(3) 
	public void  testMethodOne() {
	System.out.println("This is a Test Method One: "+this);
}

//@Test
@Disabled
public void  testMethodTwo() {
	System.out.println("This is a Test Method Two: "+this);
}
  @BeforeAll 
  public void beforeAllLifeCycleMethod() {
  System.out.println("Before All"); }
  
  @AfterAll 
  public void afterAllLifeCycleMethod() {
  System.out.println("After All"); }
 
@BeforeEach
public void  beforeEachLifeCycleMethod() {
	System.out.println("Before Each");
}

@AfterEach
public void  afterEachLifeCycleMethod() {
	System.out.println("After Each");
}


















}
