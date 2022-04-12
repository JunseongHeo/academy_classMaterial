package ch4_control;

public class For7 {

	public static void main(String[] args) {
		int i, j;
		for (i=1; i<5; i++) {
			for (j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
