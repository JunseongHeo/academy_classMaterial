// �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ�����

package alsong;

import java.util.Scanner;

public class Test4_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� ����� ������ �˰���� �������� �Է����ּ���");
		int number = scanner.nextInt(); // �Է¼���
		
		int count = 0; // ����� ����
		
		for ( int i = 1; i <= number; i++) {
			if ( number%i == 0) { // �����������
				System.out.print(i+", "); //ǥ��
				count++;
			}
		}
		System.out.println("\n�Է��Ͻ� ���� "+number+"�� ����� ������ "+count+"�� �Դϴ�."); // ����ǥ��
	}
}
