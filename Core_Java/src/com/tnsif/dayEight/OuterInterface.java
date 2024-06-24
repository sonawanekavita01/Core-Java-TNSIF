package com.tnsif.dayEight;

public interface OuterInterface {
	int N=10;
	interface InnerInterface{
		
		int N=20;
		void display();
		
	}
	void show();
}