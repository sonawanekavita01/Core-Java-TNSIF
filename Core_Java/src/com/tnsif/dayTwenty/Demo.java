package com.tnsif.dayTwenty;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

public class Demo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();	
         list.add(10);
         list.add("Hello");

         System.out.println("-----------------------------------------");
         
         AndroidSeries obj =new AndroidSeries("A23",14);
         System.out.println(obj.model);
         System.out.println(obj.screenSize);
          Class c =obj.getClass();
          System.out.println("SmartTv details");
          Annotation an1 =c.getAnnotation(SmartTV.class);
          SmartTV s1 =(SmartTV) an1;
          System.out.println(s1.os());
          System.out.println(s1.price());
          
	

	
	}
}