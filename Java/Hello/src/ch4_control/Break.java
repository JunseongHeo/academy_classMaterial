package ch4_control;

public class Break {

	public static void main(String[] args) {
		int i = 1;
		for (;;) { // ;;�� ���ѹݺ�
			System.out.println((i++)+"\t");
			if (i == 11) {
				break;
			}
			
		}
	}

}
