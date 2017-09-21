package ds.e.doublylinkedlist;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.displayAll();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.displayAll();
		
		list.insertLast(40);
		list.displayAll();
		
		list.insertAfter(20, 22);
		list.displayAll();
		
		list.insertBefore(22, 21);
		list.displayAll();
	}

}
