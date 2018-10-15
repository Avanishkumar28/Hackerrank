package av.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SkipItretor<T> implements Iterator<T> {
	
	private Iterator<T> itr;
	private T holder;
	
	public SkipItretor(Iterator<T> itr) {
		this.itr = itr;
	}

	@Override
	public boolean hasNext() {
			return itr.hasNext();
	}

	@Override
	public T next() {
		holder = itr.next();
		itr.next();
		return holder;
	}

	
	
	public static void main(String... s) {
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> numList = Arrays.asList(arr);
		
		SkipItretor<Integer> skipItr = new SkipItretor<>(numList.iterator());
		
		while (skipItr.hasNext()) {
			System.out.println(skipItr.hasNext());
			System.out.println(skipItr.hasNext());
			System.out.println(skipItr.next());
			System.out.println(skipItr.next());
			//System.out.println(skipItr.next());*/
		}
	}
}
