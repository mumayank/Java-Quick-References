package ds.c.singlylinkedlist;

public class Test {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
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
