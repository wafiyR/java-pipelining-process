
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program demonstrate the implementation for IPC.
 * The input to this program will be from other application.
 * 
 * To run this program on terminal,
 * java AdderApplication <int1> <int2> | java MultiplierApplication
 * example, java AdderApplication 20 30 | java MultiplierApplication
 * @author emalianakasmuri
 *
 */
public class MultiplierApplication {
	
	public static void main (String args[]) throws Exception {
		
		// Object to create stream
		BufferedReader in = null;
		
	    	try {
	    			// Object to read from pipeline
	    			in = new BufferedReader(new InputStreamReader(System.in));
	    			
	    			// Continue to read and process input until the end of pipeline
					String line;
					while ((line = in.readLine()) != null) {
					
						// Get total of multiplication
						String number = "2";
						Multiplier multiplier = new Multiplier();
						int total = multiplier.getTotalMultiplication(line, number);
						/*double exponential = multiplier.getExponential(line, number);*/
						
						// Display the output
						/*System.out.println("Total addition from Adder = " + line);
						System.out.println("Multiplication from Adder and " + number + " = " + total);
						System.out.println("Exponential from Adder = " + exponential);*/
						
						System.out.println(line);
						System.out.println(total);
					}
				
	    	} catch (IOException e) {
	        
			e.printStackTrace();
			throw e;
			
	    } finally {
	    	
	    	// This should terminate the endless looping reading from pipeline
	        if (in != null) {
	            in.close();
	        }
	        
	    }
		
		
	}

}
