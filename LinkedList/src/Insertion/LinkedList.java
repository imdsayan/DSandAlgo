package Insertion;

class LinkedList { 
	Node head;
	
	static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			next=null;
		}
	}
	
	//to add Nodes(at the end of the list)
	public void append(int value) {
		Node new_node = new Node(value);
		if(head==null) {
			head=new_node;
		}
		else {
		Node last = head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new_node;
		}
	}
	
	//insert node at the beginning 
	public void push(int value) {
		Node new_node = new Node(value);
		new_node.next=head;
		head=new_node;
	}
	
	//insert after a particular node
	public void insertAfterNode(Node prev_node,int value) {
		Node new_node = new Node(value);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	
	//print the list
	public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.value);
			node=node.next;
		}
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.append(2);
		list.append(7);
		list.append(9);
		list.push(19);
		list.insertAfterNode(list.head, 18);
		list.insertAfterNode(list.head.next.next, 90);
		list.printList();
		
	}
}