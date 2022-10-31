package com.ArrayListCrudOperations;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.ArrayListCrudOperations.dao.StudentDao;
import com.ArrayListCrudOperations.daoimpl.StudentDaoImpl;
import com.ArrayListCrudOperations.model.Student;

class StudentTest {

	// creating object for student and dao
	private Student s;
	private static StudentDao dao;
	private List<Student> slist;

	@BeforeEach
	void createStudent() {
		s = new Student();
		dao = new StudentDaoImpl();
		slist = new ArrayList<>();

	}

	// positive testCase

	@DisplayName("To add student in collection")
	@Test
	void addStudentInCollection() {
		s.setId(101);
		s.setName("Shuruti");
		s.setMarks(89.6f);
		slist.add(s);
		assertThat(slist).contains(s);
	}

	// negative testCase

	@DisplayName("To add student in collection: Negative")
	@Test
	void addStudentInCollectionNegative() {
		s.setId(101);
		s.setName("Shuruti");
		s.setMarks(89.6f);

		assertThat(slist).contains(s);
	}

	// positive testCase
	@DisplayName("To test name is not null")
	@Test
	@Order(2)
	void nameIsNull() {

		s.setName("Prithwish");
		assertThat(s.getName()).isNotNull();

	}

	// negative testCase
	@DisplayName("To test name is not null: negative")
	@Test
	@Order(2)
	void nameIsNullNegative() {

		s.setName("Prithwish");
		assertThat(s.getName()).isNull();

	}

	// positive testCase
	@DisplayName("To delete a student")
	@Test
	@Order(3)
	void testDeleteStudent() {
		s.setId(102);
		s.setName("Mitul");
		s.setMarks(90.7f);
		dao.addStudent(s);
		assertThat(dao.deleteStudent(102)).isTrue();

	}
	// negative

	@DisplayName("To delete a student :negative")
	@Test
	@Order(3)
	void testDeleteStudentNeagtive() {
		s.setId(102);
		s.setName("Mitul");
		s.setMarks(90.7f);
		assertThat(dao.deleteStudent(102)).isTrue();

	}

	// positive
	@DisplayName("To update the student")
	@Test

	void checkUpdateStudent() {
		s.setId(104);
		s.setName("Sonu");
		s.setMarks(95.6f);
		dao.addStudent(s);
		assertThat(dao.updateStudent(104)).isTrue();

	}

	// negative
	@DisplayName("To update the student:Negative")
	@Test

	void checkUpdateStudentNegative() {
		s.setId(104);
		s.setName("Sonu");
		s.setMarks(95.6f);
		dao.addStudent(s);
		assertThat(dao.updateStudent(103)).isTrue();

	}

}
