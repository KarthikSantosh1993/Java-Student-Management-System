package com.oops.sms;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("karthik", 20,"HYD", "9876543210", 34, 84, 99, 79);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInfo();
		
//		
//		Student s2 = new Student("Satya", 20,"HYD", "9876543219", 35, 80, 79, 69);
//		s2.displayStudentInfo();
//
	}
}
