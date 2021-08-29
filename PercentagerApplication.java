import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PercentagerApplication {
	
	public static void main (String args[]) throws Exception {
		
		// Object to create stram
		BufferedReader in = null;
		
	    	try {
	    			// Object to read from pipeline
	    			in = new BufferedReader(new InputStreamReader(System.in));
	    			
					String line;
					// declare new percentager 
					Percentager percentager = new Percentager();
					// declare an arraylist to store read-in line
					ArrayList<String> list = new ArrayList<String>();
					
					// Continue to read and process input until the end of pipeline
					while ((line = in.readLine()) != null) {
						list.add(line);
					}
					double result = percentager.getPercentage(list.get(0),list.get(1));
					list.forEach((n) -> System.out.println(n)); 
					System.out.println("The percentage of Adder and Doubler is : "+result+"%");
					
					
				
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
