package com.JunitDemo1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	static int a, b;

	@BeforeClass
	public static void callFirst() {

		a = b = 50;
		System.out.println("a and b are set to 50........");

	}

	@Before
	public void callBeforeTestCase() {
		System.out.println("Before test");
	}

	// for each method
	// positive test case
	@Test
	public void testAdd() {
		assertEquals("Checking sum...", 100, new Calculator().add(a, b));
	}

	// negative test case
	@Test
	public void testAdd2() {
		assertEquals("Checking sum...", 102, new Calculator().add(a, b));
	}

	@Test
	public void testSub() {
		assertEquals("Checking subtraction..", 0, new Calculator().sub(a, b));
	}

	@Test(timeout = 500)
	public void testTimeOut() {
		System.out.println("To enforce to timeout");
		while (true) {
		}
	}

	@After
	public void callAfterTestCase() {
		System.out.println("After test case");
	}

	@AfterClass
	public static void callLast() {
		a = b = 0;
		System.out.println(" a and b are reset");

	}

	@Ignore // deactivate
	public void neverRun() {
		System.out.println("Dont run this");
	}

}
