package sort.c.merge;

public class MergeSort {

	public static void doSort(int[] list, int p, int r) {
		if (r > p) {
			int q = (p + r) / 2;
			doSort(list, p , q);
			doSort(list, q+1, r);
			merge(list, p, q, r);
		}
	}
	
	private static void merge(int[] list, int p, int q, int r) {
		int leftIndex = p;
		int rightIndex = q+1;
		int k = 0;
		int[] tempList = new int[r-p+1];
		
		while (leftIndex <= q && rightIndex <= r) {
			if (list[leftIndex] < list[rightIndex]) {
				tempList[k++] = list[leftIndex++];
			} else {
				tempList[k++] = list[rightIndex++];
			}
		}
		
		while (leftIndex <= q) {
			tempList[k++] = list[leftIndex++];
		}
		
		while (rightIndex <= r) {
			tempList[k++] = list[rightIndex++];
		}
		
		for (int i=0; i<tempList.length; i++) {
			list[p+i] = tempList[i];
		}
	}
	
}
