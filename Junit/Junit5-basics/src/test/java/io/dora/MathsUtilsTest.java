package io.dora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathsUtilsTest {
	MathsUtils mathsUtils;

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all.");
	}

	// here static method does not have dependency .

	@BeforeEach
	void init() {
		mathsUtils = new MathsUtils();
	}

	@AfterEach
	void cleanUp() {
		System.out.println("Clean Up");
	}

	@Test
	@DisplayName("Testing add method....")

	void test() {

		System.out.println("----------We are testing our applications by having some test cases.-------------");

		int expected = 2;

		MathsUtils mathsTest = new MathsUtils();
		mathsTest.add(1, 8);
		int actual = mathsTest.add(1, 1);
		assertEquals(expected, actual, "This add method should add the two values....");

	}

	@Test
	void testComputeCircleRadius() {
		MathsUtils mathsTest = new MathsUtils();
		assertEquals(314.1592653589793, mathsTest.computerCircleArea(10), "should return right circle area.....");
	}

	// probably executed around try catch inside the try catch ...[assertEquals].

	@Test
	void testdivision() {
		
		boolean value=false;

		assertTrue(value);

		MathsUtils mathsUtils = new MathsUtils();

		assertThrows(ArithmeticException.class, () -> mathsUtils.division(1, 0),
				"divide by zero should throw an excetion as we have given assertthrows it can handle the data  and avoid exceptions whenever we have an exception it will throw to handle the exceptions we have the data asserthrows from the assertions.........");

	}

	@Test
	@Disabled
	@DisplayName("TTD method should not be run..")
	void testDisabled() {
		fail("This test should be disabled");
	}

	// @Disabled --> This annotation hook is used to diable the errors in the
	// code...

}