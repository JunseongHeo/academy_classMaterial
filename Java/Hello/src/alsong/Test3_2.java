// �������� �о ������ ���ϴ� ���α׷��� �ۼ�����

package alsong;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ���Ϸ��� �������� �Է����ּ���");
		int absolute = scanner.nextInt();
		
		if(absolute >= 0) {
			System.out.println("���� : "+ absolute);
		} else {
			System.out.println("���� : "+ -absolute);
		}
		
	}
}
