package av.java;

import java.io.IOException;

public class ReturnInFinally {

	public static void main(String[] args) {
		System.out.println(m_one());

	}

	private static int m_one() {
		try {
			System.out.println("Hello");
			throw new IOException();
			//return 0;
		} catch (Exception e) {
			return 1;
		}finally {
			System.out.println("Finally..");
			return 2;
		}
		//return 0;
	}

}
