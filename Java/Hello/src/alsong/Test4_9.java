// ������������ �о �� �ڸ����� ����ϴ� ���α׷��� �ۼ�����
package alsong;

import java.util.Scanner;

public class Test4_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ڸ����� ���ϰ� ���� ���� �������� �Է����ּ���");
		
		int number = scanner.nextInt();
		int i = 0;
		
		while ( number >= 1) {
			number /= 10;
			i++;
		}
		System.out.println("�Է��Ͻ� ������������ �ڸ����� "+(i)+ "�Դϴ�.");
	}
}
