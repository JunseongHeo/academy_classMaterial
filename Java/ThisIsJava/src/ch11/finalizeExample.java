package ch11;

public class finalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for (int i=1; i<=10; i++) {
			counter = new Counter(i);
		}
		counter = null;
		
		System.gc();
	}
}
