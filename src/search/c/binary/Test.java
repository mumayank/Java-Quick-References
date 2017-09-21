package search.c.binary;

public class Test {
	public static void main(String args[]) {
		int[] list = {1,4,5,9,10};
		System.out.println(BinarySearch.doSearch(list, 5, 0, list.length-1));
		System.out.println(BinarySearch.doSearch(list, 67, 0, list.length-1));
	}
}
