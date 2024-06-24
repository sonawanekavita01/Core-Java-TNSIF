package com.tnsif.dayEight;
public class GreetDemo {

	public static void main(String[] args) {
			
		GreetImp obj=new GreetImp();
		System.out.println(obj.sayHello("Kavita"));
			
		GreetImp2 obj2=new GreetImp2();
		System.out.println(obj2.sayHello("Dhanshree"));
			
			
			
		//Using Lambda Expression
		IGreet iObj=(name)->"Hii "+ name;
		System.out.println(iObj.sayHello("Diksha"));
			
		//OR
			
		iObj=(name)->{
			return ("Good Morning "+name);
		};
		System.out.println(iObj.sayHello("Jay"));
	}

}

