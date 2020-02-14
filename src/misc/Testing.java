package misc;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import search.BinarySearch;
import search.JumpSearch;
import search.LinearSearch;
import sort.BubbleSort;

public class Testing {

	public static void main(String[] args) {

		System.out.print("--- Searching ---\n");

		Integer[] intArraySearch = Arrays.stream(IntStream.range(0, 8).toArray()).boxed().toArray(Integer[]::new);
		Integer intKey = 2;
		String[] strArraySearch = { "a", "b", "c", "d", "e", "f" };
		String strKey = "c";

		LinearSearch linearSearch = new LinearSearch();
		System.out.println(format("Searchtype: LinearSearch, Itemtype: Integer, Array: %s, Key: %d, Index: %d",
				Arrays.toString(intArraySearch), intKey, linearSearch.search(intArraySearch, intKey)));
		System.out.println(format("Searchtype: LinearSearch, Itemtype: String, Array: %s, Key: %s, Index: %d",
				Arrays.toString(strArraySearch), strKey, linearSearch.search(strArraySearch, strKey)));

		BinarySearch binarySearch = new BinarySearch();
		System.out.println(format("Searchtype: BinarySearch, Itemtype: Integer, Array: %s, Key: %d, Index: %d",
				Arrays.toString(intArraySearch), intKey, binarySearch.search(intArraySearch, intKey)));
		System.out.println(format("Searchtype: BinarySearch, Itemtype: String, Array: %s, Key: %s, Index: %d",
				Arrays.toString(strArraySearch), strKey, binarySearch.search(strArraySearch, strKey)));

		JumpSearch jumpSearch = new JumpSearch();
		System.out.println(format("Searchtype: JumpSearch, Itemtype: Integer, Array: %s, Key: %d, Index: %d",
				Arrays.toString(intArraySearch), intKey, jumpSearch.search(intArraySearch, intKey)));
		System.out.println(format("Searchtype: JumpSearch, Itemtype: String, Array: %s, Key: %s, Index: %d",
				Arrays.toString(strArraySearch), strKey, jumpSearch.search(strArraySearch, strKey)));

		System.out.print("\n--- Sorting ---\n");

		Integer[] intArraySort = { 8, 4, 1, 7, 2, 3, 6, 5 };
		String[] strArraySort = { "c", "f", "b", "a", "d", "e" };

		ArrayList<Integer> intListSort = new ArrayList<Integer>(Arrays.asList(intArraySort));
		ArrayList<String> strListSort = new ArrayList<String>(Arrays.asList(strArraySort));

		BubbleSort bubbleSort = new BubbleSort();
		System.out.println(
				format("Sorttype: BubbleSort, Collectiontype: Array, Itemtype: Integer, Original: %s, Sorted: %s.",
						Arrays.toString(intArraySort), Arrays.toString(bubbleSort.sort(intArraySort))));
		System.out.println(
				format("Sorttype: BubbleSort, Collectiontype: Array, Itemtype: String, Original: %s, Sorted: %s.",
						Arrays.toString(strArraySort), Arrays.toString(bubbleSort.sort(strArraySort))));
		System.out.println(
				format("Sorttype: BubbleSort, Collectiontype: List, Itemtype: Integer, Original: %s, Sorted: %s.",
						intListSort, bubbleSort.sort(intListSort)));
		System.out.println(
				format("Sorttype: BubbleSort, Collectiontype: List, Itemtype: String, Original: %s, Sorted: %s.",
						strListSort, bubbleSort.sort(strListSort)));
		
		System.out.print("\n--- Misc ---\n");
		
		System.out.println(String.format("Fibonacci (n-th number): n: %d -> %d", 35, Fibonacci.f(1, 0, 0, 35)));
	}
}
