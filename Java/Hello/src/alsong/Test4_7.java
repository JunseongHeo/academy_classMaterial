// �Է��� ���� ������ŭ '*'�� ǥ���ϴ� ���α׷��� �ۼ�����
// ���������� �ٹٲ� ���ڸ� ����Ұ�
// ��, ���� ���� 1�̸��̸� �ٹٲ� ���ڸ� ǥ���ؼ��� �ȵȴ�.

package alsong;

import java.util.Scanner;

public class Test4_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ǥ���ϰ���� *�� ���ڸ� �Է����ּ���.");
		int amount = scanner.nextInt();
		
		if ( amount >= 1 ) {
			for (int i = 0; i<amount; i++) {
				System.out.print("*");
			}
			System.out.println();
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		}
	}  // while�� Ȱ���Ͽ� �ۼ��� �� �ִ�.
}
