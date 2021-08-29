import java.lang.Math;
/**
 * This class represents multiplier application
 * @author emalianakasmuri
 *
 */
public class Multiplier {
	
	
	/**
	 * This method parse the input and multiply the two inputs
	 * @param number1
	 * @param number2
	 * @return total of from multiplication of two numbers
	 */
	public int getTotalMultiplication(String input1, String input2) {
		
		// Parse supplied input 
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);

		// Compute the total
		int total = number1 * number2;

		return total;
		
	}
	
	public double getExponential(String input1, String input2){
		
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		
		double exponential = Math.pow(number1, number2);
		
		return exponential;
	}

}
