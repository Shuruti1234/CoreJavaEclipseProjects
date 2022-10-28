package com.JunitDemo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	@BeforeClass
	public static void callFirst() {
		System.out.println("Before all the classes executed exactly once");

	}

	@Before
	public void callBeforeTestCase() {
		System.out.println("Before test case");
	}

	// for each method
	@Test
	public void test1() {
		System.out.println("Inside test1");
	}

	@Test
	public void test2() {
		System.out.println("Inside test2");
	}

	@Test
	public void test3() {
		System.out.println("Inside test3");
	}

	@After
	public void callAfterTestCase() {
		System.out.println("After test case");
	}

	@AfterClass
	public static void callLast() {
		System.out.println("After all the classes executed exactly once");

	}

}
