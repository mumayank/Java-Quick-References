package sort.a.selection;

public class SelectionSort {
	
	public static int[] doSort(int[] list) {
		for (int i=0; i<list.length; i++) {
			int min = i;
			for (int j=i+1; j<list.length; j++) {
				if (list[j] < list[min]) {
					min = j;
				}
			}
			
			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;
		}
		return list;
	}
	
}
