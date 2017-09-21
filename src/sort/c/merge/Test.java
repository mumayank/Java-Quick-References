package sort.c.merge;

public class Test {

	public static void main(String[] args) {
		int[] list = {4,1,3,2,5};
		MergeSort.doSort(list, 0, list.length -1 );
		for (int i: list) {
			System.out.println(i);
		}
	}

}
