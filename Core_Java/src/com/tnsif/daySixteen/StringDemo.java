package com.tnsif.daySixteen;

public class StringDemo {

	public static void main(String[] args) {
	String s1="Hello";//allocates on string pool
	String s2="Hello";//points to the memory location of s1
	String s3=new String("Hello");//allocated directly on heap
	
	System.out.println("s1== s2?"+(s1==s2));//it checks memory references -true
	System.out.println("s1== s3?"+(s1==s3));//it checks memory references -false
	System.out.println("s1.equals(s3)?"+s1.equals(s3));//it checks memory contents -true
	
	
	String s4=s1;
	String s5=s3;
	String s6= new String(s3);
	String s7=s3.intern(); //intern refer existing method
	
	System.out.println("s1== s4?"+(s1==s4));//it checks memory references -true
	System.out.println("s5== s3?"+(s5==s3));//it checks memory references -true
	System.out.println("s6== s3?"+(s6==s3));//it checks memory references  -false
	System.out.println("s7== s3?"+(s7==s3));//it checks memory references  -false
	System.out.println("--------------------------------------------");
	s1="Hi";// //Create another instance on string pool and s1 will refer that 
	s3+="!How are you ?";//Create another on string instance on string pool and s3 will refer that 
	System.out.println(s1);
	System.out.println(s3);
	
	System.out.println("s1== s2?"+(s1==s2));//it checks memory references -false
	System.out.println("s1== s3?"+(s1==s3));//it checks memory references -false
	System.out.println("s5== s3?"+(s5==s3));//it checks memory references -false
	

	
	}

}
