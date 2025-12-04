package com.oops.sms;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private String address;
	private String contactNumber;
	private int rollNumber;
	private int marksObtainedInEnglish;
	private int marksObtainedInMaths;
	private int marksObtainedInScience;

	private String grade;
	private double totalMarks;
	private double percentage;

	public Student(String name, int age, String address, String contactNumber, int rollNumber,
			int marksObtainedInEnglish, int marksObtainedInMaths, int marksObtainedInScience ) {
		super();
		if (validateAge(age) && validateMarks(marksObtainedInEnglish) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInScience) && validateAddress(address)
				&& validateContactNumber(contactNumber)) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;

		}
	}

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
			System.err.println("Invalid age for Student ");
		}

	}

	public boolean validateAge(int age) {
		if (age >= 10 && age < 25) {
			return true;
		} else {
			System.err.println("Invalid age for Student ");
			return false;
		}

	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;

	}

	public void setMarksObtainedInEnglish(int marksObtainedInEnglish) {

		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.err.println("invalid marks for English ");
		}

	}

	public int getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(int marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.err.println("invalid marks for Maths ");
		}
	}

	public int getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(int marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.err.println("invalid marks for Science ");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			this.contactNumber = contactNumber;
		} else {
			System.err.println("Invalid contact number for student ");
		}

	}

	public boolean validateMarks(int marksForSubject) {
		if (marksForSubject >= 0 && marksForSubject <= 100) {
			return true;
		} else {
			System.err.println("invalid marks for subject ");
			return false;
		}

	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;

	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {

		if (percentage == 0) {
			grade = "cannot be calculated ";
		} else {
			if (percentage > 90) {
				grade = "A";

			} else if (percentage > 80) {
				grade = "B";

			} else if (percentage > 75) {
				grade = "C+";

			} else if (percentage > 70) {
				grade = "C";

			} else if (percentage > 65) {
				grade = "D+";

			} else if (percentage > 60) {
				grade = "D";

			} else {
				grade = "F";
			}
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			return false;
		}

	}

	public void displayStudentInfo() {
		System.out.println("-------------------Student Information-----------------");
		System.out.println("NAME: "+ name);
		System.out.println("AGE: "+ age);
		System.out.println("ADDRESS: "+ address);
		System.out.println("CONTACT NUMBER: "+ contactNumber);
		System.out.println("ENGLISH MARKS: "+ marksObtainedInEnglish);
		System.out.println("MATHS MARKS: "+ marksObtainedInMaths);
		System.out.println("SCIENCE MARKS: "+ marksObtainedInScience);
		System.out.println("-------------------------------------------------------");
		System.out.println("TOTAL MARKS: "+ totalMarks);
		System.out.println("PERCENAGE: "+ percentage + "%");
		System.out.println("GRADE: " + grade);
		System.out.println("-------------------------------------------------------");
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", rollNumber=" + rollNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
				+ ", marksObtainedInMaths=" + marksObtainedInMaths + ", marksObtainedInScience="
				+ marksObtainedInScience + ", grade=" + grade + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, grade, marksObtainedInEnglish, marksObtainedInMaths,
				marksObtainedInScience, name, percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(grade, other.grade)
				&& marksObtainedInEnglish == other.marksObtainedInEnglish
				&& marksObtainedInMaths == other.marksObtainedInMaths
				&& marksObtainedInScience == other.marksObtainedInScience && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

}
