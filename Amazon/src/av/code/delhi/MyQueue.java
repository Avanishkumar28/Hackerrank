package av.code.delhi;

public class MyQueue<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	private int size; 


	public void add(T value) {
		if(head == null) {
			head = tail = new Node<T>(value);
		}else {
			tail.next = new Node<T>(value);
			tail = tail.next;
		}
		setSize(getSize() + 1);
	}

	public T get() {
		if(head == null) {
			throw new IllegalAccessError("Queue is empty!");
		}else {
			T value = head.getValue();
			head = head.next;
			setSize(getSize() - 1);
			return value;
		}
		
	}
	
	public Node<T> getHead() {
		return head;
	}
	public void setHead(Node<T> head) {
		this.head = head;
	}
	public Node<T> getTail() {
		return tail;
	}
	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	class Node<T>{
		private T value;
		private Node<T> next;
		
		public Node(T value) {
			super();
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
		
	}

}
