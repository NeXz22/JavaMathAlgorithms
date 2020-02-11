package sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements Sortable {

	public <T extends Comparable<T>> T[] sort(T[] array) {
		return bubbleSort(array);
	}

	public <T extends Comparable<T>> List<T> sort(List<T> list) {
		return bubbleSort(list);
	}

	/**
	 * sorts an array via the bubbleSort-algorithm
	 * 
	 * @param array the array to be sorted
	 * @return new sorted array
	 */
	private <T extends Comparable<T>> T[] bubbleSort(T[] array) {

		T[] newArray = array.clone();
		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i += 1) {
				if (newArray[i].compareTo(newArray[i + 1]) > 0) {
					SortUtils.swap(newArray, i, i + 1);
					swapped = true;
				}
			}
		} while (swapped);

		return newArray;
	}

	/**
	 * sorts a list via the bubbleSort-algorithm
	 * 
	 * @param list the list to be sorted
	 * @return new sorted list
	 */
	private <T extends Comparable<T>> List<T> bubbleSort(List<T> list) {

		List<T> newList = new ArrayList<T>(list);
		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < list.size() - 1; i += 1) {
				if (newList.get(i).compareTo(newList.get(i + 1)) > 0) {
					SortUtils.swap(newList, i, i + 1);
					swapped = true;
				}
			}
		} while (swapped);

		return newList;
	}
}
