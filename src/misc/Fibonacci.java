package misc;

public class Fibonacci {

	/**
	 * Calculates the n-th number of the Fibonacci Sequence using a recursive
	 * approach
	 * 
	 * @param n maxIterations
	 * @return F(n) -> n-th Fibonacci number
	 */
	public static int f(int n) {
		return f(1, 0, 0, n);
	}

	private static int f(int a, int b, int i, int n) {
		return n > 0 ? i + 1 < n - 1 ? f(a + b, a, ++i, n) : a + b : 0;
	}
}
