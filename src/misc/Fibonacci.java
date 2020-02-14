package misc;

public class Fibonacci {

	/**
	 * Calculates the n-th number of the Fibonacci Sequence using a recursive approach
	 * 
	 * @param a		F(n-1) -> first preceding Fibonacci number
	 * @param b   	F(n-2) -> second preceding Fibonacci number
	 * @param i   	the current iteration
	 * @param n   	maxIterations
	 * @return 		F(n) -> Fibonacci number
	 */
	public static int f(int a, int b, int i, int n) {
		return n > 0 ? i + 1 < n - 1 ? f(a + b, a, ++i, n) : a + b : 0;
	}
}
