package com.tnsif.dayEight;

//Program to define Functional Interface IGreet

@FunctionalInterface
public interface IGreet {
	String sayHello(String name);
	// Functional interface must have only one Method
}