// �Է��� int�� �������� �����̸� -1,
// 0�̸� 0, ����̸� 1�� ��ȯ�ϴ� sigh Of �޼��带 �ۼ�����.

package alsong;

import java.util.Scanner;

public class Test7_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���� x : ");
		int x = scanner.nextInt();
		
		int s = signOfMethod(x);
		System.out.println("signOf(x)�� "+s+"�Դϴ�.");
	}
	public static int signOfMethod(int n) {
		int sign = 0;
		
		if (n > 0) {
			sign = 1;
		} else if (n == 0) {
			sign = 0;
		} else {
			sign = -1;
		}
		return sign;
	}
}
