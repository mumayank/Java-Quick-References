package sort.d.quick;

public class QuickSort {
	
	public static int[] doSort(int[] list) {
		doSort(list, 0, list.length-1);
		return list;
	}
	
	private static void doSort(int[] list, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivotIndex = getPivotIndex(list, startIndex, endIndex);
			doSort(list, startIndex, pivotIndex-1);
			doSort(list, pivotIndex+1, endIndex);
		}
	}
	
	private static int getPivotIndex(int[] list, int startIndex, int endIndex) {
		int i=startIndex-1;
		for (int j=startIndex; j<endIndex; j++) {
			if (list[j] > list[endIndex]) {
				j++;
			} else {
				i++;
				swap(list, i, j);
			}
		}
		
		swap(list, i+1, endIndex);
		return i+1;
	}
	
	private static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
