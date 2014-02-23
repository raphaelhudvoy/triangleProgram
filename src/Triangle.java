
public class Triangle {
	
	// Validation messages
	public static final String INSUFFICIENT_SIDES = "Insufficient number of sides were provided";
	public static final String TO_MANY_SIDES = "To many sides";
	public static final String SUCCESS	= "No problem occured";
	public static final String WRONG_INPUT_TYPE = "Inputs should be integers";
	public static final String INTEGER_OUT_OF_BOUNDS = "Inputs are too small or too big";
	public static final String NOT_A_TRIANGLE = "Not a triangle";
	public static final String SCALENE = "Scalene triangle";
	public static final String ISOSCELE = "Isocele triangle";
	public static final String EQUILATERAL = "Equilateral triangle";



	
	private int A, B, C;
	
	private boolean checkSides (int a, int b, int c) throws Exception{
		
		if ( a + b < c) {
			throw new Exception(NOT_A_TRIANGLE);
		} else {
			return true;
		}		
	}
	
	
	
	private boolean isScalene () {
		if (A != B && A != C && C != B) {
			return true;
		} else {
			return false;
		}
	}
	

	private boolean isIsoscele () {
		
		if (A == B && A == C && B == C) { // make sure is not equilateral
			return false;
		} else {
			if (A == B || A == C || B == C) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	private boolean isEquilateral () {
		
		if (A == B && A == C && B == C) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String processTriangle () {
		
		try {
			checkSides(A, B, C);	// A + B >= C	
			checkSides(A, C, B);	// A + B >= C		
			checkSides(B, C, A);	// A + B >= C			
			
			if (isScalene()) {
				return SCALENE;
			} else if (isIsoscele()) {
				return ISOSCELE;
			} else if (isEquilateral()) {
				return EQUILATERAL;
			} else {
				return NOT_A_TRIANGLE;
			}
		
		} catch (Exception e) {
			return NOT_A_TRIANGLE;
		}
	}
	
	private int checkBounds (int number) throws Exception {
		
		
		if (number < 0 || number > 100) {
			throw new Exception(INTEGER_OUT_OF_BOUNDS);
		} else {
			return number;
		}
	}
	
	public String setSides (String args[]) {
		
		if (args.length < 3) {
			return INSUFFICIENT_SIDES;
			
		} if (args.length > 3){
			return TO_MANY_SIDES;
			
		} else {
			
			try {
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				int c = Integer.parseInt(args[2]);
				
				try {
					this.A = checkBounds(a);
					this.B = checkBounds(b);
					this.C = checkBounds(c);
					
					return SUCCESS;
					
				} catch (Exception e) {
					return INTEGER_OUT_OF_BOUNDS;
				}
				
			} catch (Exception e) {
				return WRONG_INPUT_TYPE;
			}
			
			
		}
				
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		
		String res = tri.setSides(args);
		
		if (res == SUCCESS) {
			String result = tri.processTriangle();
			System.out.println(result);
			
		} else {
			System.out.println(res);
		}

	}

}
