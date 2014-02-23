import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTests {
	
	@Test
	public void SidesAllEqual() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"11","11","11"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.EQUILATERAL);
	
	}
	
	@Test
	public void isosceleSidesBandCequal() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"13","11","11"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.ISOSCELE);
	
	}
	
	@Test
	public void isosceleSidesAandCequal() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"11","13","11"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.ISOSCELE);
	
	}
	
	@Test
	public void IsoscelesSidesAandBequal() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"12","12","11"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.ISOSCELE);
	
	}
	
	@Test
	public void ScaleneTriangle() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"12","6","14"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.SCALENE);
	
	}
	
	
	
	@Test
	public void SumOfBandCSmallerThenA() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"7","3","3"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.NOT_A_TRIANGLE);
	
	}
	
	@Test
	public void SumOfAandCSmallerThenB() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"3","7", "3"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.NOT_A_TRIANGLE);
	
	}
	
	@Test
	public void SumOfAandBSmallerThenC() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"4","4", "9"};
		
		// Test functions
		String res = triangle.setSides(sides);
		assertEquals(res, Triangle.SUCCESS);
		
		res = triangle.processTriangle();
		
		//Assert
		System.out.println(res);
		assertEquals(res, Triangle.NOT_A_TRIANGLE);
	
	}
	
	
	
	@Test
	public void Inputbetween1and100InvalidtooBig() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"4","101", "50"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.INTEGER_OUT_OF_BOUNDS);
	
	}
	
	
	@Test
	public void Inputbetween1and100InvalidtooSmall() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"-3","100", "50"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.INTEGER_OUT_OF_BOUNDS);
	
	}
		
	@Test
	public void Inputbetween1and100Valid() {
		
		// Initialization
		Triangle triangle = new Triangle();
		String[] sides = {"1","100", "50"};
		
		// Test functions
		String res = triangle.setSides(sides);
		
		//Assert
		assertEquals(res, Triangle.SUCCESS);
	
	}
	
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
