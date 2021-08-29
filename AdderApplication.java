
/**
 * This program demonstrate the implementation for IPC.
 * The output from this program will be an input to another program, Doubler.
 * 
 * To run this program on terminal,
 * java AdderApplication <int1> <int2>, example java Adder 20 30
 * @author emalianakasmuri
 *
 */
public class AdderApplication {

	public static void main(String[] args) {
		
		// Get run time variables
		String variable1 = args[0];
		String variable2 = args[1];

		Adder adder = new Adder();
		int total = adder.getTotalAddition(variable1, variable2);
		
		System.out.println(total);

	}

}
