package sort.d.quick;

public class Test {

	public static void main(String[] args) {
		int[] list = {54,43,6,7,1,2,3};
		list = QuickSort.doSort(list);
		for(int i: list) {
			System.out.println(i);
		}
	}

}
