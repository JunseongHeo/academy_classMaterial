package ch4;

public class For2 {

	public static void main(String[] args) {
		int i;
		System.out.println("1~100까지의 짝수 나열");
		
		for (i=1; i<=100; i++) {
			if (i%2 == 0) {
				System.out.print(i + "\t");
			}
			if (i%2 != 0) {
				System.out.println();
			}
		}
	}
}
