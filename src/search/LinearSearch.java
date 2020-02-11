package search;

public class LinearSearch implements Searchable {

	@Override
	public <T extends Comparable<T>> int search(T[] array, T key) {
		return linearSearch(array, key);
	}

	/**
	 * Returns the 0-based index of a key in an array by using a linear search
	 * algorithm
	 * 
	 * @param array an array that extends the Comparable-Interface, should be sorted
	 *              in ascending order
	 * @param key   the value being searched for
	 * @return the index of the key, -1 if the key is not found
	 */
	private <T extends Comparable<T>> int linearSearch(T[] array, T key) {

		for (int i = 0; i < array.length; i += 1) {
			if (key.compareTo(array[i]) == 0) {
				return i;
			}
		}

		return -1;
	}
}
