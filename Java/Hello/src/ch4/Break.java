package ch4;

public class Break {

	public static void main(String[] args) {
		int i = 1;
		for (;;) { // ;;는 무한반복
			System.out.println((i++)+"\t");
			if (i == 11) {
				break;
			}
			
		}
	}

}
