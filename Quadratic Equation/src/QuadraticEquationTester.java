/**
 * The main class receives input from the user and prints the solution to the console.
 * It then asks for new inputs and uses the mutator method to solve for the new equation.
 */
import java.util.Scanner;

public class QuadraticEquationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value for coefficient a: ");
		double a = input.nextDouble();
		
		System.out.println("Please enter a value for coefficient b: ");
		double b = input.nextDouble();
		
		System.out.println("Please enter a value for coefficient c: ");
		double c = input.nextDouble();
		
		QuadraticEquation newEquation = new QuadraticEquation(a, b, c);
		QuadraticEquationSolver solveEquation = new QuadraticEquationSolver(newEquation);
		
		System.out.println("Please enter a value for x: ");
		double x = input.nextDouble();
		newEquation.evaluate(x);
		
		solveEquation.getSolution1();
		solveEquation.getSolution2();
		
		System.out.println("Please enter a value for coefficient a: ");
		double newA = input.nextDouble();
		
		System.out.println("Please enter a value for coefficient b: ");
		double newB = input.nextDouble();
		
		System.out.println("Please enter a value for coefficient c: ");
		double newC = input.nextDouble();
		
		QuadraticEquation nextEquation = solveEquation.changeEquation(newA, newB, newC);
		QuadraticEquationSolver solveNew = new QuadraticEquationSolver(nextEquation);
		solveNew.getSolution1();
		solveNew.getSolution2();
		
		

	}

}
