package ch11;

public class StringCharAtExample {

	public static void main(String[] args) {
		String snn = "920128-1230123";
		char sex = snn.charAt(7); // 8��° �ε����� ���� ����
		
		switch (sex) {
			case '1':
			case '3':
				System.out.println("�����Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("�����Դϴ�.");
				break;
		}
	}
}
