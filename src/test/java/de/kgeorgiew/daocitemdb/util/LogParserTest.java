package de.kgeorgiew.daocitemdb.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class FirstTest {

	@Test
	@DisplayName("My 1st JUnit 5 test! 😎")
	void myFirstTest(TestInfo testInfo) {
		assertEquals("My 1st JU!nit 5 test! 😎", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
	}

}