package com.tnsif.dayNine.runtimepolymorphism;

public class ClassA {
	
	int n;
	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	public void show() {
		System.out.println("N - "+n);
	}
}