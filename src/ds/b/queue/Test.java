package ds.b.queue;

public class Test {

	public static void main(String[] args) {
		Queue queue = new Queue(4);
		
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.displayAll();
		
		queue.push(50);
		queue.displayAll();
		
		queue.pop();
		queue.pop();
		queue.displayAll();
	}

}
