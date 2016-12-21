/**
 * The prime generator class generates the prime numbers up to but not including a specified value
 * @author Joseph
 *
 */
public class PrimeGenerator {
	private int num;
	
	/**
	 * The isPrime class tests a number if it is prime
	 * If the number is prime it returns true
	 * If not it returns false
	 * @param num
	 * @return
	 */
	
	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Next prime takes a value and tests the integers leading up to that number if they are prime,
	 * If the number is prime it prints it to the console
	 * @param value
	 */
	public void nextPrime(int value){
		for(int i = 2;i < value; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
}
