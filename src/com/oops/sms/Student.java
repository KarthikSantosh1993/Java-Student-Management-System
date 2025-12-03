package com.oops.sms;

public class Student {
	private String name;
	private int age;
	private int rollNumber;
	private int marksObtainedInEnglish;
	private int marksObtainedInMaths;
	private int marksObtainedInScience;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 10 && age < 21) {
			this.age = age;
		} else {
			System.out.println("Invalid age for Student ");
		}

	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("invalid Roll number: ");
		}

	}

	public int getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;

	}

	public void setMarksObtainedInEnglish(int marksObtainedInEnglish) {

		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.out.println("invalid marks for English ");
		}

	}

	public int getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(int marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.out.println("invalid marks for Maths ");
		}
	}

	public int getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(int marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.out.println("invalid marks for Science ");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calculateToalmarks() {
		double totalmarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		System.out.println("Total Marks obtained= " + totalmarks);
	}

}
