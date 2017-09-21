package search.c.binary;

public class BinarySearch {
	
	public static int doSearch(int[] list, int item, int p, int r) {
		if (r >= p) {
			int q = (p+r) / 2;
			
			if (list[q] == item) {
				return q;
			} else if (list[q] < item) {
				doSearch(list, item, q+1, r);
			} else {
				doSearch(list, item, p, q-1);
			}
		}
		
		return -1;
	}
	
}
