package search.b.linearrecursive;

public class LinearSearchRecursive {

	public static int doSearch(int[] list, int item, int index) {
		if (index < list.length-1) {
			if (list[index] == item) {
				return index;
			} else {
				return doSearch(list, item, ++index);
			}
		} else {
			return -1;
		}
	}
	
}
