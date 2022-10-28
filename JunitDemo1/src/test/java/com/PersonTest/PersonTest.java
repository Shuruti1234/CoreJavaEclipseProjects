package com.PersonTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Person.Payment;
import com.Person.PaymentImpl;
import com.Person.Person;

class PersonTest {

	static Person p;

	@BeforeAll
	public static void createPerson() {
		p = new Person();
		p.setPid(101);
		p.setName("Shuruti");
	}

	@BeforeEach
	public void runBeforeTest() {

	}

	// positive test case
	@Test
	public void testNameLength() {
		// assertThat(12 > 9).isTrue();

		Payment pay = new PaymentImpl();
		assertThat(pay.payToPerson(p.getName())).isTrue();

	}
	// negative test case

	@Test
	public void testNameLength2() {
		// assertThat(12 > 15).isTrue();

		Payment pay = new PaymentImpl();
		p.setName("am");
		assertThat(pay.payToPerson(p.getName())).isTrue();

	}

	@AfterEach
	public void runAfterTest() {

	}

	@AfterAll

	public static void runAfterAllTest() {

	}

}
