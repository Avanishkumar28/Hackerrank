package av.code.delhi;

public class ReverseListByK {
	
	public static void reverseFromK(LinkedList myList, int k) {
		if(myList==null || myList.head == null)
			return;
		Node current = myList.head;
		Node newHead = reverseByK(current, k);
		
	}

	private static Node reverseByK(Node current, int k) {
		if(current==null || k==0)
			return null;
		Node tail = current;
		tail.next = null;
		Node newHead = reverseByK(current.next, k--);
		if(newHead!=null)
			newHead.next = tail;
		else
			newHead = tail;
		 
		return newHead;
	}

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.addNode(new Node(1));
		myList.addNode(new Node(2));
		myList.addNode(new Node(3));
		myList.addNode(new Node(4));
		myList.addNode(new Node(5));
		myList.addNode(new Node(6));
		myList.addNode(new Node(7));
		myList.addNode(new Node(8));
		myList.addNode(new Node(9));
		
		myList.printList();

	}

}

class LinkedList{
	Node head;
	Node tail;
	int size;
	
	public void addNode(Node node) {
		if(tail!=null) {
			Node current = tail;
			tail = node;
			current.next = tail;
		}else if(head == null) {
			head = node;
			tail = node;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void printList() {
		if(head == null)
			System.out.println("List is enpty!");
		else{
			Node current = head;
			while(current != null) {
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
}

class Node{
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	
}
