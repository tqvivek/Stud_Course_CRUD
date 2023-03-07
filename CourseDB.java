package com.crud;

import java.util.Scanner;

public class CourseDB {

	static Scanner sc = new Scanner(System.in);
	static int x = 0;

	public void addCourse(Course c) {
		System.out.println("Enter course Id :");
		c.setId(sc.nextInt());

		System.out.println("Enter course Name:");
		c.setName(sc.next());

		System.out.println("Enter fees:");
		c.setFees(sc.nextFloat());
		System.out.println("____________________________");
	}

	public void updateCourse(Course c[], int cid) {
		for (int i = 0; i < x; i++) {
			if (c[i].getId() == cid) {
				System.out.println(c[i].getName() + " " + c[i].getFees());
				System.out.println("Enter Course Name");
				String name = sc.next();
				c[i].setName(name);
				System.out.println("Enter Fees");
				float fees = sc.nextFloat();
				c[i].setFees(fees);
				break;
			}

		}

	}

	public void deleteCourse(Course[] c, int cid) {
		boolean flag = false;
		for (int i = 0; i < x; i++) {
			if (c[i].getId() == cid) {
				flag = true;
				System.out.println(c[i].getId() + " " + c[i].getName() + " " + c[i].getFees());
				for (int j = i; j < x - 1; j++) {
					c[j] = c[j + 1];
				}
				c[x - 1] = null;
				System.out.println("Course " + cid + " delete successfully");
				if (!flag) {
					System.out.println("Course not found");
				}
				break;
			}
		}

	}

	public void viewCourse(Course ct[]) {
		for (int i = 0; i < x; i++) {
			System.out.println(ct[i]);
		}
	}

	public void viewCourseByID(Course[] c, int cid) {
		for (int i = 0; i < x; i++) {
			if (c[i].getId() == cid)
				System.out.println(c[i].toString());
		}
	}

	public static void main(String[] args) {

		CourseDB cdb = new CourseDB();

		Course c[] = new Course[5];
//		for (int i = 0; i < c.length; i++) {
//			c[i] = new course();
//		}

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("__________CourseDB________________");
			System.out.println("****Choose Following Options:**** ");
			System.out.println("1.Add Course");
			System.out.println("2.Update Course");
			System.out.println("3.View Course");
			System.out.println("4.View Course By Id");
			System.out.println("5.Delete Course");
			System.out.println("-------------------------");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				// for (int i = 0; i < c.length; i++) {
				if (x < c.length) {
					c[x] = new Course();
					cdb.addCourse(c[x]);
					x++;
				} else {
					System.out.println("you have already added maximum courses");
				}

				// }
				break;
			case 2:
				System.out.println("Enter Course Id to update :");
				int id = sc.nextInt();
				cdb.updateCourse(c, id);
				System.out.println("Course updated successfully!");
				break;

			case 3:
				cdb.viewCourse(c);
				break;

			case 4:
				System.out.println("Enter Id for View Course");
				int cid1 = sc.nextInt();
				cdb.viewCourseByID(c, cid1);
				break;

			case 5:
				System.out.println("Enter Id for delete");
				int cid = sc.nextInt();
				cdb.deleteCourse(c, cid);
				break;

			case 6:
				System.out.println("Invalid Input");

			}
			System.out.println("Do you want to perform more operation Yes-1/No-0");
			choice = sc.nextInt();
		} while (choice == 1);

	}
}
