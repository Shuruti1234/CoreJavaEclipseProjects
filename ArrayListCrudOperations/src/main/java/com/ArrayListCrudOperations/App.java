package com.ArrayListCrudOperations;

import java.util.Scanner;

import com.ArrayListCrudOperations.dao.StudentDao;
import com.ArrayListCrudOperations.daoimpl.StudentDaoImpl;
import com.ArrayListCrudOperations.model.Student;

/**
 * Hello world!
 *
 */
public class App {

	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Search Student");
		System.out.println("5. Display all the students");
		System.out.println("6.Exit");
	}

	public static void main(String[] args) {
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		StudentDao school = new StudentDaoImpl();

		// declaring varible choice
		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				switch (ch) {
				case 1:
					Student ss = new Student();
					// input the details of student
					System.out.println("Enter the id :");
					ss.setId(sc1.nextInt());
					System.out.println("Enter the name :");
					ss.setName(sc1.next());
					System.out.println("Enter the marks :");
					ss.setMarks(sc1.nextFloat());
					school.addStudent(ss);
					System.out.println("Student inserted..........");
					break;
				case 2:
					System.out.println("Enter the Id to be deleted:");
					int id = sc1.nextInt();
					boolean flag = school.deleteStudent(id);
					if (flag)
						System.out.println("Student deleted.......");
					else
						System.out.println("Student not found......");
					break;

				case 3:
					System.out.println("Enter the Id to be updated:");
					id = sc1.nextInt();
					flag = school.updateStudent(id);
					if (flag)
						System.out.println("Student updated......");
					else
						System.out.println("Student not found......");
					break;

				case 4:
					ss = null;
					System.out.println("Enter the Id to be searched:");
					id = sc1.nextInt();
					ss = school.findStudent(id);
					if (ss == null)
						System.out.println("Student not found.......");
					else
						System.out.println(
								"Student Id :" + ss.getId() + "  Name:" + ss.getName() + "   Marks:" + ss.getMarks());
					break;

				case 5:
					school.displayAll();
					break;

				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input.......");

				}

			} while (ch != 6);

			// end of do while

			sc1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
