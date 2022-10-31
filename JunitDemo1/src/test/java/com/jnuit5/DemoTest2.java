package com.jnuit5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test cases for AssertJ")
class DemoTest2 {

	@BeforeAll
	static void beforeAllMethods() {

	}

	@BeforeEach
	void beforeTestCase() {

	}

	@DisplayName("String test")
	@Test
	void testStringNull() {
		String s = "Java";
		assertThat(s).isNotNull(); // positive test case

		String s1 = null;
		assertThat(s1).isNull();

	}

	@DisplayName("Comparison Test")
	@Test
	void compareValues() {

		int actual = 10;
		int expected = 10;
		assertThat(actual).isEqualByComparingTo(expected);
		// assertThat(actual).isNotEqualByComparingTo(expected);

	}

	@DisplayName("Array having same values")
	@Test
	void arrayContainsSameValues() {
		int arr1[] = { 1, 2, 4 };
		int arr2[] = { 1, 2, 4 };

		assertThat(arr1).isEqualTo(arr2);

	}

	@AfterEach
	void afterTestCase() {

	}

	@AfterAll
	static void afterAllMethods() {

	}

}
