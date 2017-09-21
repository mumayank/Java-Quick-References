package search.d.binaryrecursive;

public class BinarySearchRecursive {
	
	public static int doSearch(int[] list, int item) {
		int p = 0;
		int r = list.length - 1;
		
		while (r >= p) {
			int q = (p + r) / 2;
			
			if (list[q] == item) {
				return q;
			} else if (list[q] < item) {
				p = q+1;
			} else {
				r = q-1;
			}	
		}
		
		return -1;
	}
	
}
