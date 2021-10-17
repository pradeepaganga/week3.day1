package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name");

	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.studentName();
		s.studentId();
		s.deptName();
		s.CollegeCode();
		s.CollegeName();
		s.CollegeRank();


	}

}
