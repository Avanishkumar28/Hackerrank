package av.java;

public class NullArrayTest {

	public static void main(String[] args) {
		String[] names = {"Avanish", "Amit", null};
		names = null;
		
		if("Tarvinder".equals(names[2])) {
			System.out.println(names[2]);
		}else {
			System.out.println("No name");
		}

	}

}
