import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before // Before each test method
	public void setUp() throws Exception {
	}

	@After // After each test method
	public void tearDown() throws Exception {
	}
	
	@Test // To annotate that this is a test method
	public void testAdd() {
		//Arrange - Setting up the objects
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act - Calling the method
		int actual = cal.add (a, b);
		
		//Assert - Checking that the expected outcome is the same as the actual, by using JUnit method, assertEquals
		int expected = 5555;
		assertEquals(expected, actual); // Method - assertEquals(expected, actual), asserts that two values are equals
	}
	@Test
	public void testSubtract() {
		//Arrange
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		//Act
		int actual = cal.subtract (a, b);
		//Assert2
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		//Arrange
		int a = 1;
		int b = 5555;
		Calculator cal = new Calculator();
		//Act
		int actual = cal.multiply(a, b);
		//Assert3
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//Arrange
		int a = 5555;
		int b = 1;
		Calculator cal = new Calculator();
		//Act 
		int actual = cal.divide (a, b);
		//Assert4
		int expected = 5555;
		assertEquals(expected, actual);
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
