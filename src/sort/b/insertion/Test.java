package sort.b.insertion;

import sort.a.selection.SelectionSort;

public class Test {

	public static void main(String[] args) {
		int[] list = {5,1,2,4,3};
		list = SelectionSort.doSort(list);
		for (int i: list) {
			System.out.println(i);
		}
	}

}
