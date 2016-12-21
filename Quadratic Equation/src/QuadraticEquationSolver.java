/**
 * Quadratic equation solver class solves for x given the coefficients of a quadratic equation
 */
import java.lang.Math;

public class QuadraticEquationSolver {
	private QuadraticEquation equation;
	private double a;
	private double b;
	private double c;
	
/**
 * The constructor receives an object from the Quadratic equation class and uses the coefficients in that class
 * @param newEquation
 */
	public QuadraticEquationSolver(QuadraticEquation newEquation){
		equation = newEquation;
		a = equation.getA();
		b = equation.getB();
		c = equation.getC();
	}
	/**
	 * the method getSolution1 solves for the smaller solution to the quadratic equation
	 * If there are no real solutions it returns 0 and prints no real solutions to the console
	 * @return
	 */
	public double getSolution1(){
		double discriminant = (b*b) - (4*a*c);
		if(discriminant > 0){
			double solution = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.println(solution);
			return solution;
		}
		else{
			System.out.println("There are no real solutions");
			return 0;
		}
	}
	
	/**
	 * the method getSolution2 solves for the larger solution to the quadratic equation
	 * If there are no real solutions it returns 0 and prints no real solutions to the console
	 * @return
	 */
	
	public double getSolution2(){
		double discriminant = (b*b) - (4*a*c);
		if(discriminant > 0){
			double solution = (-b + Math.sqrt(discriminant))/(2*a);
			System.out.println(solution);
			return solution;
		}
		else{
			System.out.println("There are no real solutions");
			return 0;
		}
	}
	
	/**
	 * The changeEquation method is a mutator method. Given a new set of inputs for the coefficients it creates a new object of the Quadratic class
	 * From the new object the solver class can be used to solve for the new equation
	 * @param nextA
	 * @param nextB
	 * @param nextC
	 * @return
	 */
	
	public QuadraticEquation changeEquation(double nextA, double nextB, double nextC){
		QuadraticEquation nextEquation = new QuadraticEquation(nextA, nextB, nextC);
		return nextEquation;
	}

}
