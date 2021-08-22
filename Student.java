package org.student;

import org.department.Department;

public class Student extends Department {

	public void StudentName() {
		System.out.println("Student Name is John ");
	}

	public void StudentDept() {
		System.out.println("Student Department is EEE ");
	}

	public void Studentid() {
		System.out.println("Student id is 201 ");
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.StudentName();
		obj.StudentDept();
		obj.Studentid();
		System.out.println("Multilevel Inhertiance call");
		Department obj1 = new Department();
		obj1.collegecode();
		obj1.collegeName();
		obj1.collegerank();
		obj.DepartmentName();

	}

}
