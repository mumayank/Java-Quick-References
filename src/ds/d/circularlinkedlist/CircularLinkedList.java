package ds.d.circularlinkedlist;

public class CircularLinkedList {

	private Node head;
	private Node tail;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = head;
		head = newNode;
		
		if (tail == null) {
			tail = head;
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		tail.nextNode = newNode;
		tail = newNode;
	}
	
	public void deleteFirst() {		
		head = head.nextNode;
		
		if (head == null) {
			tail = null;
		}
	}
	
	public void modifyData(int dataToModify, int newData) {
		Node temp = head;
		while (temp.data != dataToModify) {
			temp = temp.nextNode;
		}
		temp.data = newData;
	}
	
	public void displayAll() {
		if (head == null) {
			System.out.println("nothing to show.\n");
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
		System.out.println();
	}
}
