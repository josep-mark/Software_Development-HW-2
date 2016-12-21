/**
 * This class takes the input for a quadratic equation and returns the coefficients for later use
 * It also solves given a value of x, should you be interested
 */
import java.lang.Math;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	private double x;
	
	/**
	 * The constructor assigns values to the coefficients of a quadratic equation
	 * @param newA
	 * @param newB
	 * @param newC
	 */
	
	public QuadraticEquation(double newA, double newB, double newC){
		a = newA;
		b = newB;
		c = newC;
	}
	/**
	 * This method returns the value of the equation given an input of x
	 * @param newX
	 * @return
	 */
	public double evaluate(double newX){
		x = newX;
		double xSquared = Math.pow(x, 2);
		double equation = (a*xSquared) + (b * x) + c;
		return equation;
	}
	
	/**
	 * The accessor classes return the values of the coefficients, used in the QuadraticEquationSolver class
	 * @return
	 */
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
}
