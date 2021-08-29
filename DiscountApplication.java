import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscountApplication {
	
	public static void main (String args[]) throws Exception {
		
		// Object to create stram
		BufferedReader in = null;
		
	    	try {
	    			// Object to read from pipeline
	    			in = new BufferedReader(new InputStreamReader(System.in));
	    			
					String line;
					double discountRate = 0;
					
					// Continue to read and process input until the end of pipeline
					while ((line = in.readLine()) != null) {
					
						double price = Double.parseDouble(line);
						//define the discount rate based on total amount read in using variable "line"
						if(price<100){
						discountRate = 3;
						}
						else if(price>=100 && price<=300){
						discountRate = 5;
						}
						else if(price>300 && price<=500){
						discountRate = 7;
						}
						else if(price>500 && price<=700){
						discountRate = 9;
						}
						else if(price>700){
						discountRate = 11;
						}
						
						double total = price*((100-discountRate)/100);
						
						System.out.println("The total amount of ordered food is : "+price);
						System.out.println("The discount you will get is : "+discountRate+"%");
						System.out.println("Total amount need to pay will be : RM"+total);
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
