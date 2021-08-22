package org.student;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id is" + id);
	}

	public void getStudentInfo(String emailid, long phoneno) {
		System.out.println("Student email is" + emailid);
		System.out.println("Student phoneno is" + phoneno);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is" + id);
		System.out.println("Student name is" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj = new Students();
		System.out.println("Method Overloading call");
		obj.getStudentInfo(100);
		obj.getStudentInfo(101, "JOhn");
		obj.getStudentInfo("john@testleaf.com", 101);

	}
}
