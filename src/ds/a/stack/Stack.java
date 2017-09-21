package ds.a.stack;

public class Stack {
	int topItem;
	int[] list;
	
	public Stack(int maxSize) {
		list = new int[maxSize];
		topItem = -1;
	}
	
	public void push(int data) {
		if (topItem == list.length-1) {
			System.out.println("Cannot insert new item as stack is full.");
			return;
		}
		
		list[++topItem] = data;
	}
	
	public void pop() {
		if (topItem == -1) {
			System.out.println("Cannot pop item as stack is empty.");
			return;
		}
		
		topItem--;
		System.out.println("Item popped.");
	}
	
	public void displayAll() {
		if (topItem == -1) {
			System.out.println("Stack is empty.");
			return;
		}
		
		for(int i=topItem; i>=0; i--) {
			System.out.println(list[i]);
		}
	}
}
