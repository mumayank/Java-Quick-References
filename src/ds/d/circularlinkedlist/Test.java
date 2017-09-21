package ds.d.circularlinkedlist;

public class Test {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		
		list.displayAll();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.displayAll();
		
		list.insertLast(40);
		list.displayAll();
		
		list.modifyData(40, 50);
		list.displayAll();
		
		list.deleteFirst();
		list.displayAll();
	}

}
