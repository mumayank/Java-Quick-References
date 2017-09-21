package ds.c.singlylinkedlist;

public class SinglyLinkedList {

	private Node head;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = head;
		head = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		Node temp = head;
		while(temp.nextNode != null) {
			temp = temp.nextNode;
		}
		
		temp.nextNode = newNode;
	}
	
	public void deleteFirst() {
		head = head.nextNode;
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
