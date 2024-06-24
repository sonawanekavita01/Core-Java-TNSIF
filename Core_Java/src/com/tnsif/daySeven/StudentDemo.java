package com.tnsif.daySeven;
public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setUid("T05040715");
		s1.setName("Kavita");
		s1.setBranch("IT");
	//	Student.setTechTrainer("Alpana");
	//	Student.setSoftSkillTrainer("Divya");

		Student s2=new Student();
		s2.setUid("T05040730");
		s2.setName("Dhanshree");
		s2.setBranch("CS");
	//	s2.setTechTrainer("Alpana");
	//	s2.setSoftSkillTrainer("Divya");
		
		Student s3=new Student("T05040802","Kavya","IT");
		
		System.out.println(s1);
	
		System.out.println(s2);
		
		System.out.println(s3);
	
	}

}
