/** basic biased coin flip */

import java.util.Random;

public class Flip{
	
	public static void main(String[] args){
		double bias = 0.5;  // 50% heads, 50% tails
		int countHeads = 0;
		int countTails = 0;
		//-------------
		java.util.Random die = new Random();
		
		int coinFlip = flip.nextDouble();
		boolean ok = true;
		if (bias>nextDouble){
			return  
		}
		
		if(args.length == 1){
			try{
				bias = Double.parseDouble(args[0]);
			}catch(Exception e){
				System.out.println("command line argument must be a number");
				ok = false;
			}
		}
		if(ok){
			System.out.print("heads, " + "tails, " + "bias is " + bias);
		}
	}
}