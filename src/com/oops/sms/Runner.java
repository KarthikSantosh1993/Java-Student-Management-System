package com.oops.sms;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("karthik", 20, 34, 84, 99, 79);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		System.out.println(s1);

	}
}
