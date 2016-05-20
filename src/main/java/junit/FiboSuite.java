package junit;

public class FiboSuite {
	
	static final int maxInt = Integer.MAX_VALUE;

	/**
	 * Compute the Sequence number 
	 * @param n : 0 or positive Integer 
	 * @return int that represent the nth number of Fibonnacci sequence
	 * 
	 * @throws IllegalArgumentException if n < 0
	 * @throws IllegalArgumentException
	 */
	
	public static int fibo(int n) {
		if(n < 0) {throw new IllegalArgumentException("Fibonacci does'nt work for negative values");}
		if(n > 46) {throw new IllegalArgumentException("Too large value (>46) to return an Integer");}
		if(n==0) { return 0; }
		if(n<=2) { return 1; }
		
		return fibo(n-1)+fibo(n-2);
	}
}
