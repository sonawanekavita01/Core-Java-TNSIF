package com.tnsif.daySixteen;

public class StringFunction {

	public static void main(String[] args) {
		String s="Hello! How are you?";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.startsWith("HELLO"));
		System.out.println(s.endsWith("?"));
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("How"));
		System.out.println(s.substring(6));
		System.out.println(s.replace("Hello","Hi"));
		System.out.println(s);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
	
		String[] words=s.split(" ");
		for(String str:words)
			System.out.println(str);
	}

}
