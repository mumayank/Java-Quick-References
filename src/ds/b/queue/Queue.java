package ds.b.queue;

public class Queue {

	private int pushIndex;
	private int popIndex;
	private int[] list;
	
	public Queue(int maxSize) {
		list = new int[maxSize];
		pushIndex = -1;
		popIndex = -1;
	}
	
	public void push(int data) {
		if (pushIndex == list.length-1) {
			pushIndex = -1;
		}
		
		list[++pushIndex] = data;
	}
	
	public void pop() {
		if (popIndex == list.length-1) {
			popIndex = -1;
		}
		
		list[++popIndex] = -1;
	}
	
	public void displayAll() {
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();
	}
}
