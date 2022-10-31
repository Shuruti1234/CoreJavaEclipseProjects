package com.ArrayListCrudOperations.dao;

import com.ArrayListCrudOperations.model.Student;

public interface StudentDao {

	void addStudent(Student s);

	boolean deleteStudent(int id);

	boolean updateStudent(int id);

	Student findStudent(int id);

	void displayAll();

}
