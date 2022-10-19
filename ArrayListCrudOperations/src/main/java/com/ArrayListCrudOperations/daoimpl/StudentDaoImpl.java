package com.ArrayListCrudOperations.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOperations.dao.StudentDao;
import com.ArrayListCrudOperations.model.Student;

public class StudentDaoImpl implements StudentDao {

	List<Student> sList = new ArrayList<Student>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);
	// creating student object

	@Override
	public void addStudent() {

		// creating student object
		Student ss = new Student();
		// input the details of student
		System.out.println("Enter the id :");
		ss.setId(sc.nextInt());
		System.out.println("Enter the name :");
		ss.setName(sc.next());
		System.out.println("Enter the marks :");
		ss.setMarks(sc.nextFloat());

		// adding the student into the collection
		sList.add(ss);
		System.out.println(sList);

	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Student sdel = null;
		// finding the student
		for (Student s : sList) {
			if (s.getId() == id)
				sdel = s;
		}
		// check whether the record is present
		if (sdel == null)
			status = false;
		else {
			sList.remove(sdel);
			status = true;
		}

		return status;
	}

	@Override
	public boolean updateStudent(int id, Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findStudent(int id) {

		Student sfind = null;
		// finding the student
		for (Student s : sList) {
			if (s.getId() == id)
				sfind = s;
		}

		return sfind;
	}

}
