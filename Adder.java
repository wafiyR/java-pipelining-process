
/**
 * This class represent addition operation.
 * 
 * @author emalianakasmuri
 *
 */
public class Adder {
	
	/**
	 * This method parse string input to enable arithmetic operation and 
	 * compute the total from addition of two numbers.
	 * @param input1
	 * @param input2
	 * @return total of addition
	 */
	public int getTotalAddition (String input1, String input2) {
		
		// Parse supplied input 
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);

		// Compute the total
		int total = number1 + number2;

		return total;
		
	}

}
