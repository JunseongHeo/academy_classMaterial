// ���μ�����

package alsong;

import java.util.Scanner;

public class Test8_practice {

	public static void main(String[] args) {
		int k = 2; // 2���� 1�� �����ϴ� ����
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���μ������� ���� �Է����ּ���");
		int num=scanner.nextInt();
		
		while(num != 1) {
			if ( num % k == 0) {
				System.out.println(k);
				num /= k;
			} else {
				k++;
			}
		}
	}
}
