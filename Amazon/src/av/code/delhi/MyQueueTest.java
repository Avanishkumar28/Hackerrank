package av.code.delhi;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue<Integer> myQ = new MyQueue<>();
		
		myQ.add(10);
		myQ.add(12);
		myQ.add(8);
		myQ.add(4);
		myQ.add(2);
		myQ.add(9);
		System.out.println("My Q size: "+myQ.getSize());
		
		while(myQ.getSize()!=0) {
			System.out.println("Q: "+myQ.get());
		}

	}

}
