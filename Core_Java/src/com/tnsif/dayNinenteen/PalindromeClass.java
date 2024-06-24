package com.tnsif.dayNinenteen;

public class PalindromeClass{

	//generic method
	<T>void display(T t) {
		System.out.println("You entered : "+t);
		System.out.println("Typeis : "+t.getClass());
		
	}
	<T> boolean checkPalindrome(T t)
	{
		//System.out.println(t.getClass().getName().equals("java.lang.String"));
	if(t.getClass().getName().equals("java.lang.String"))
	{
		String s=t.toString();
		System.out.println(s);
		return s.equals(new StringBuffer(s).reverse().toString());
				
	}else if(t.getClass().getName().equals("java.lang.Integer"))
	{int n=Integer.parseInt(t.toString());
	int n1=n, rev=0;
	while(n!=0) {
		rev=rev*10+n%10;
		n=n/10;
	}
return n1==rev;
	}else {
		System.out.println("Not a String or Integer ");
		return false;
		
	}
	}
}
