package com.ArrayListCrudOperations.dao;

import com.ArrayListCrudOperations.model.Student;

public interface StudentDao {

	void addStudent();

	boolean deleteStudent(int id);

	boolean updateStudent(int id, Student s);

	Student findStudent(int id);

}
