package ch4;

public class BreakOutterExample {

	public static void main(String[] args) {
		// �ݺ��� �̸�(��)
		Outter : for (char upper = 'A'; upper <= 'Z'; upper++) { 
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower=='g') {
					break Outter; // Outter�� �̸��� �ݺ������κ��� Ż��
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}
}
