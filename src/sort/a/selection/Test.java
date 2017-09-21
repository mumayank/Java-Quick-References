package sort.a.selection;

public class Test {

	public static void main(String[] args) {
		int[] list = {34,43,5,6,7,1,2};
		list = SelectionSort.doSort(list);
		for (int i: list) {
			System.out.println(i);
		}
	}

}
