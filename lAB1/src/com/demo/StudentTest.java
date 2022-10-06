package com.demo;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch, sage;
		String sname, sadd;

		Student stud[] = new Student[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter 1 to create a default student");
			System.out.println("Enter 2 to create a student without address");
			System.out.println("Enter 3  to create a complete student");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				stud[i] = new Student();
				break;
			case 2:
				System.out.println("Enter name:");
				sname = sc.next();
				System.out.println("Enter age:");
				sage = sc.nextInt();
				stud[i] = new Student();
				stud[i].setInfo(sname, sage);
				break;

			case 3:
				System.out.println("Enter name:");
				sname = sc.next();
				System.out.println("Enter age:");
				sage = sc.nextInt();
				System.out.println("Enter address:");
				sadd = sc.next();
				stud[i] = new Student();
				stud[i].setInfo(sname, sage, sadd);
				break;
			default:
				System.out.println("Default student created ..");
				stud[i] = new Student();

			}

		}

		for (int j = 0; j < stud.length; j++) {
			System.out.println();
			System.out.println("Student " + (j + 1) + ":");
			System.out.print(
					"Name :" + stud[j].getName() + "   Age:" + stud[j].getAge() + "   Address:" + stud[j].getAddress());

		}

		sc.close();
	}

}
