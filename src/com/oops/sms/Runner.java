package com.oops.sms;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("karthik");
		s1.setAge(25);
		s1.setRollNumber(0531);
		s1.setMarksObtainedInEnglish(84);
		s1.setMarksObtainedInMaths(99);
		s1.setMarksObtainedInScience(79);
		s1.setGrade("A");
		
		System.out.println(s1.getName());

		System.out.println(s1.getAge());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getMarksObtainedInEnglish());
		System.out.println(s1.getMarksObtainedInMaths());
		System.out.println(s1.getMarksObtainedInScience());
		System.out.println(s1.getGrade());
		
		s1.calculateToalmarks();
	}

}
