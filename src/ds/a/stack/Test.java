package ds.a.stack;

public class Test {

	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.displayAll();
		System.out.println();
		
		stack.pop();
		System.out.println();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.displayAll();
		System.out.println();
		
		stack.push(50);
		System.out.println();
		
		stack.pop();
		System.out.println();
		
		stack.displayAll();
	}

}
