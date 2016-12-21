/**
 * The BuffonNeedle class runs the buffon needle experiment
 */

import java.util.Random;
import java.lang.Math;

public class BuffonNeedle {
	private double yLow;
	private double yHigh;
	private double alpha;
	private double rate;
	
	public BuffonNeedle(){
		
	}
	
	/**
	 * runTest method runs the test 10,000 times
	 * It uses two randomized values yLow and alpha
	 * yLow can be anything between 0 and 2
	 * alpha is the variable
	 */
	public void runTest(){
		double tries = 0;
		double hits = 0;
		Random rand1 = new Random();
		Random rand2 = new Random();
		for(int i = 0; i < 10000; i++){
			yLow = 2 * rand1.nextDouble();
			alpha = 180 * rand2.nextDouble();
			alpha = Math.toRadians(alpha);
			yHigh = yLow + Math.sin(alpha);
			if(yHigh < 2){
				tries ++;
			}
			else{
				hits++;
				tries++;
			}
		}
		rate = tries/hits;
		System.out.println(rate);
	}
	
}
