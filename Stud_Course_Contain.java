package com.crud;

import java.util.Scanner;

public class Stud_Course_Contain {

	static Scanner sc = new Scanner(System.in);

	public static void addStudent(Student s1) {

		System.out.println("Enter the Student Details: ");
		System.out.println("Enter the Id: ");
		s1.setStudId(sc.nextInt());

		System.out.println("Enter the Student name: ");
		s1.setStudName(sc.next());

		System.out.println("Enter the Student age : ");
		s1.setStudAge(sc.nextInt());

		System.out.println("Enter the course Details:  ");
		s1.setCourse(new Course());
		System.out.println("Enter the course id: ");
		s1.getCourse().setId(sc.nextInt());

		System.out.println("Enter the course name: ");
		s1.getCourse().setName(sc.next());

		System.out.println("enter the fees: ");
		s1.getCourse().setFees(sc.nextFloat());

		System.out.println("********************");
	}

	public static void main(String[] args) {

		Stud_Course_Contain cDb = new Stud_Course_Contain();

		Student s1[] = new Student[3];
		for (int i = 0; i <= s1.length; i++) {

			s1[0] = new Student();
			addStudent(s1[0]);
			System.out.println(s1[0]);

		}
	}

}
