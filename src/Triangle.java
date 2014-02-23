
public class Triangle {
	
	// Validation messages
	public static final String INSUFFICIENT_SIDES = "Insufficient number of sides were provided";
	public static final String TO_MANY_SIDES = "To many sides";
	public static final String SUCCESS	= "No problem occured";
	public static final String WRONG_INPUT_TYPE = "Inputs should be integers";

	
	private int A, B, C;
	
	public Triangle () {
		
	}
	
	public String setSides (String args[]) {
		
		if (args.length < 3) {
			return INSUFFICIENT_SIDES;
		} if (args.length > 3){
			return TO_MANY_SIDES;
		} else {
			
			try {
				this.A = Integer.parseInt(args[0]);
				this.B = Integer.parseInt(args[1]);
				this.C = Integer.parseInt(args[2]);
				
				return SUCCESS;
				
			} catch (Exception e) {
				return WRONG_INPUT_TYPE;
			}
			
			
		}
				
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//

	}

}
