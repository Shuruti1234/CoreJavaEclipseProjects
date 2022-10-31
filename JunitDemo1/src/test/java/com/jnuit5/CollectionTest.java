package com.jnuit5;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CollectionTest {

	// creating variables
	private Object first;
	private Object second;
	private List<Object> list;

	@BeforeEach
	void createCollection() {
		first = new Object();
		second = new Object();
		System.out.println("Objects are ready..........");
		Object ar[] = { first, second };
		list = Arrays.asList(ar);
	}

	@DisplayName("Size of collection test")
	@Test
	void checkSize() {
		assertThat(list).hasSize(2);
	}

}
