// �������� �о� ��ȣ(���/����/0)�� �����ϴ� ���α׷��� �ۼ�����

package alsong;

import java.util.Scanner;

public class Test3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���. '���/0/����'�� �ǵ��մϴ�.");
		int a = scanner.nextInt();
		
		if ( a > 0) {
			System.out.println("��� �Դϴ�.");
		} else if( a == 0) {
			System.out.println("0�Դϴ�.");
		} else {
			System.out.println("���� �Դϴ�.");
		}
		
		
	}
}
