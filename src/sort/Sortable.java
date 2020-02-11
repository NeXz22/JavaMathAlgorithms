package sort;

import java.util.List;

public interface Sortable {

	public <T extends Comparable<T>> T[] sort(T[] array);

	public <T extends Comparable<T>> List<T> sort(List<T> list);
}
