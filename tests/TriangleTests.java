import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTests {
	
	@Test
	public void wrongInputDouble() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"4.4","4.9", "4.0"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.WRONG_INPUT_TYPE);
	
	}
	
	@Test
	public void wrongInputString() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"a","4", "4"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.WRONG_INPUT_TYPE);
	
	}
	
	@Test
	public void threeSides() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"3","2", "4"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.SUCCESS);
	
	}
	
	@Test
	public void ToManySides() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"3","2", "4", "6"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.TO_MANY_SIDES);
	
	}

	@Test
	public void notEnoughSides() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"3","2"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.INSUFFICIENT_SIDES);
	
	}
	
	

}
