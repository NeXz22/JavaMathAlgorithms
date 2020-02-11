package sort;

import java.util.List;

public class SortUtils {

	public static <T extends Comparable<T>> void swap(T[] array, int i1, int i2) {
		T tmp = array[i1];
		array[i1] = array[i2];
		array[i2] = tmp;
	}

	public static <T extends Comparable<T>> void swap(List<T> list, int i1, int i2) {
		T tmp = list.get(i1);
		list.set(i1, list.get(i2));
		list.set(i2, tmp);
	}
}
