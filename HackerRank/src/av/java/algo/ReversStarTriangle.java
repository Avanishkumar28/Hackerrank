package av.java.algo;

public class ReversStarTriangle {
	
	public static void printTriangle(int hight) {
		for(int i = 0; i<hight; i++) {
			//System.out.printf("%"+(hight+1)+"s", new String(new char[i+1]).replace("\0", "#")+"\r");
			System.out.printf("%"+(hight+1)+"s", new String(new char[i+1]).replace("\0", "#")+"\n");
			
		}
	}
	
	public static void main(String[] args) {
		printTriangle(6);
	}

}
