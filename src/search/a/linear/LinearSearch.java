package search.a.linear;

public class LinearSearch {

	public static int doSearch(int[] list, int item) {
		for (int i=0; i<list.length; i++) {
			if (list[i] == item) {
				return i;
			}
		}
		return -1;
	}
	
}
