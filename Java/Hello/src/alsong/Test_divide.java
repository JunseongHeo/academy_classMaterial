// 2���� ���� �������� �о, ���ڰ� ������ ����̸� "B�� A�� ����̴�"��� ǥ���ϰ�,
// �׷��� ������ "B�� A�� ����� �ƴϴ�."��� ǥ���ϴ� ���α׷��� �ۼ�����

package alsong;

import java.util.Scanner;

public class Test_divide {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2���� ���� �������� �Է����ּ���");
		
		int a = scanner.nextInt();
		System.out.println("ù��°�� �Է��� ���� A�� "+a+"�Դϴ�.");
		
		int b = scanner.nextInt();
		System.out.println("ù��°�� �Է��� ���� B�� "+b+"�Դϴ�.");
		
		System.out.println();
		if (a%b == 0 ) {
			System.out.println("B�� A�� ����Դϴ�.");
		} else {
			System.out.println("B�� A�� ����� �ƴմϴ�.");
		}
	}
}
