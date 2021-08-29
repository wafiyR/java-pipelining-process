public class Percentager{
	
	/**
	 * This method parse string input to enable arithmetic operation and 
	 * compute the adder and doubler to get their percentage.
	 * @param input1
	 * @param input2
	 * @return percentage
	 */
	 
	public double getPercentage(String input1, String input2){
		
		double number1 = Integer.parseInt(input1);
		double number2 = Integer.parseInt(input2);
		
		double percentage = (number1/number2)*100;
		
		return percentage;
	}
}