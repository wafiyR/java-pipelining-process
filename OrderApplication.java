import java.util.*;

public class OrderApplication{
	
	public static void main(String [] args){
	
	double price = 0;
	double total = 0;
	ArrayList<Double> code = new ArrayList<Double>();
	ArrayList<Double> quantity = new ArrayList<Double>();
	
	for(int i=0; i<args.length; i+=2){
		//read in Run-time value
		String variable1 = args[i];
		String variable2 = args[i+1];
	
		code.add(Double.parseDouble(variable1));
		quantity.add(Double.parseDouble(variable2));
	}
		//define the price for each product code to be used later in the calculation
	for(int j=0; j<code.size(); j++){
		if(code.get(j)==101){
			price = 11.95;
		}
		else if(code.get(j)==102){
			price = 14.15;
		}
		else if(code.get(j)==103){
			price = 11.45;
		}
		
		//get total amount of order
		total += price*quantity.get(j);	
	}
	System.out.println(total);
	}
}