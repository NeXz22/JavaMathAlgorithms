package search;

public interface Searchable {

	public <T extends Comparable<T>> int search(T array[], T key);
}
