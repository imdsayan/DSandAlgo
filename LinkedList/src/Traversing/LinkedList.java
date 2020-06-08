package Traversing;

public class LinkedList {
    Node head;
	
	
	static class Node {
		int value;
		Node next;
		Node(int value){
			this.value=value;
			next=null;
		}
		
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head=new Node(20);
		Node second = new Node(21);
		Node third = new Node(25);
		
		//connection
		list.head.next=second;
		second.next=third;
		list.printList();
		
	}

}
