package ds.e.doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (head != null) {
			newNode.nextNode = head;
			head.previousNode = newNode;
		}
		
		head = newNode;
		
		if (tail == null) {
			tail = head;
		}
		
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (tail != null) {
			tail.nextNode = newNode;
			newNode.previousNode = tail;
		}
		
		tail = newNode;
	}
	
	public void insertAfter(int referenceData, int data) {
		Node nodeBefore = head;
		
		while (nodeBefore.data != referenceData) {
			nodeBefore = nodeBefore.nextNode;
		}
		
		Node nodeAfter = nodeBefore.nextNode;
		
		Node newNode = new Node();
		newNode.data = data;
		
		nodeBefore.nextNode = newNode;
		newNode.previousNode = nodeBefore;
		newNode.nextNode = nodeAfter;
		nodeAfter.previousNode = newNode;
	}
	
	public void insertBefore(int referenceData, int data) {
		Node nodeAfter = head;
		
		while (nodeAfter.data != referenceData) {
			nodeAfter = nodeAfter.nextNode;
		}
		
		Node nodeBefore = nodeAfter.previousNode;
		
		Node newNode = new Node();
		newNode.data = data;
		
		nodeBefore.nextNode = newNode;
		newNode.previousNode = nodeBefore;
		newNode.nextNode = nodeAfter;
		nodeAfter.previousNode = newNode;
	}
	
	public void displayAll() {
		if (head == null) {
			System.out.println("Nothing to display.\n");
			return;
		}
		
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
		
		System.out.println();
	}
}
