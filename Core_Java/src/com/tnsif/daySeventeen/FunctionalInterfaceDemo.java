package com.tnsif.daySeventeen;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		/*System.out.println(Thread.currentThread().getName());
		Runnable r =()->{
			for(int i=1; i<=50; i++) {
				System.out.println(Thread.currentThread().getName()+"\t Hello");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
					
				}
			}
		};
		//Create child thread
		Thread t1 = new Thread(r,"Thread1");
		Thread t2 = new Thread(r,"Thread2");
          t1.start();
          t2.start();
          r=()->{
        	  int i=2;
        	  while(i<=100) {
        			System.out.println(Thread.currentThread().getName());
        			i+=2;
        			try {
    					Thread.sleep(300);
    				}catch(InterruptedException e) {
    					e.printStackTrace();
    					
    				}
        	  }
          };
	//Thread t3=new Thread(r,"Thread3");
	//t3.start();
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(40);
		a.add(80);
		a.add(60);
		a.add(90);
		a.add(30);
		a.add(50);
		System.out.println("---------before sorting-----------");
		System.out.println(a);
		System.out.println("---------after sorting-----------");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("--------- after  sorting in descending-----------");
	Comparator<Integer> comp=(n1,n2)->n2-n1;
	Collections.sort(a, comp);
	System.out.println(a);
		
		
	ArrayList<String> s =new ArrayList<String>();
	s.add("Pooja");
	s.add("Nutan");
	s.add("Neha");
	s.add("Prachi");
	s.add("Meghana");
	s.add("Nikita");	
	s.add("Pranjal");
	System.out.println(s);
Collections.sort(s);
System.out.println(s);

Comparator<String> strcomp=(s1,s2)->s2.compareTo(s1);
Collections.sort(s, strcomp);
System.out.println(s);


ArrayList<Student> studList =new ArrayList<Student>();
studList.add(new Student(10,"Nikita",67,"IT"));
studList.add(new Student(9,"Manoj",77,"CSE"));
studList.add(new Student(20,"Sanket",37,"MECH"));
studList.add(new Student(30,"Vaibhav",27,"CIVIL"));
studList.add(new Student(6,"Krishana",66,"IT"));
studList.add(new Student(1,"Nilim",60,"AIDS"));
System.out.println("---------before sorting-----------");
System.out.println(studList);


Comparator<Student> studcomp=(s1,s2)->s1.getName().compareTo(s2.getName());
Collections.sort(studList,studcomp);
System.out.println("----------------------------------------");
System.out.println(studList);

*/


GreetInterface greet ;
greet =new Greet1();

//greet =(s)->"Hello " + s;

System.out.println(greet.sayHello("Students!"));

//greet=(s)->"Hi "+s+ " How are you ?";
greet =new Greet2();
System.out.println(greet.sayHello("Students!"));

}
}


class Greet1 implements GreetInterface{
	@Override
	public String sayHello(String name) {
		return "Hello" +name;
		
	}
}
class Greet2 implements GreetInterface{
	@Override
	public String sayHello(String name) {
		return "Hii" +name + "How are you?";
		
	}
}