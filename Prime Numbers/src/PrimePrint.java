/**
 * The prime printer class takes a user input and uses the prime generator class to print out the prime numbers before it.
 */
import java.util.Scanner;

public class PrimePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		
		PrimeGenerator newTrial = new PrimeGenerator();
		newTrial.nextPrime(input.nextInt());
		
		

	}

}
