package search;

public class BinarySearch implements Searchable {

	@Override
	public <T extends Comparable<T>> int search(T[] array, T key) {
		return binaraySearch(array, key);
	}

	/**
	 * Returns the 0-based index of a key in an array by using a binary search
	 * algorithm
	 * 
	 * @param array an array that extends the Comparable-Interface, should be sorted
	 *              in ascending order
	 * @param key   the value being searched for
	 * @return the index of the key, -1 if the key is not found
	 */
	private <T extends Comparable<T>> int binaraySearch(T[] array, T key) {

		int a = 0;
		int b = array.length - 1;

		while (a <= b) {
			int m = (a + b) / 2;
			if (key.compareTo(array[m]) == 0) {
				return m;
			} else if (key.compareTo(array[m]) > 0) {
				a = m + 1;
			} else if (key.compareTo(array[m]) < 0) {
				b = m - 1;
			}
		}

		return -1;
	}
}
