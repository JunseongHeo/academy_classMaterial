// ���� 1~12�� ���������� �о �ش��ϴ� ������ ǥ���ϴ� ���α׷��� �ۼ�����
package alsong;

import java.util.Scanner;

public class Test3_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է����ּ���. �ش� ���� ������ ǥ���մϴ�.");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1: case 2: case 12:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5:
			System.out.println("�� �Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("�����Դϴ�.");
			break;
			
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. ������� ���ڸ� �Է����ּ���");
			break;
		}
		
	}

}
