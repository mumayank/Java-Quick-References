package search.b.linearrecursive;

public class Test {

	public static void main(String[] args) {
		int[] list = {1,6,4,9,8,7,6,1,2,3};
		System.out.println(LinearSearchRecursive.doSearch(list, 34, 0));
		System.out.println(LinearSearchRecursive.doSearch(list, 4, 0));
	}

}
