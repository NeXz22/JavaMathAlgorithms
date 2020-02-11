package search;

public class JumpSearch implements Searchable {

	@Override
	public <T extends Comparable<T>> int search(T[] array, T key) {
		return jumpSearch(array, key);
	}

	/**
	 * Returns the 0-based index of a key in an array by using a jump search
	 * algorithm
	 * 
	 * @param array an array that extends the Comparable-Interface, should be sorted
	 *              in ascending order
	 * @param key   the value being searched for
	 * @return the index of the key, -1 if the key is not found
	 */
	private <T extends Comparable<T>> int jumpSearch(T[] array, T key) {

		int n = array.length;
		int a = 0;
		int b = (int) Math.sqrt(n);

		while (key.compareTo(array[Math.min(b, n) - 1]) > 0) {
			a = b;
			b += (int) Math.sqrt(n);
			if (a >= n) {
				return -1;
			}
		}

		while (key.compareTo(array[a]) > 0) {
			a += 1;
			if (a == Math.min(b, n)) {
				return -1;
			}
		}

		return key.compareTo(array[a]) == 0 ? a : -1;
	}
}
