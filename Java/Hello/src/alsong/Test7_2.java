// 3���� int �� �μ� a, b, c �� �ּڰ��� ���ϴ� min �޼��带 �ۼ�����.
// �Լ� ���� ���� int min(int a, int b, int c)

package alsong;

import java.util.Scanner;

public class Test7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ּڰ��� ���ϰ���� ���� 3���� �Է����ּ���");

		System.out.print("���� a : ");
		int a = scanner.nextInt();
		System.out.print("���� b : ");
		int b = scanner.nextInt();
		System.out.print("���� c : ");
		int c = scanner.nextInt();
		System.out.println("�ּڰ��� "+minMethod(a,b,c)+" �Դϴ�.");
		}

	public static int minMethod(int a, int b, int c) {
		int minNumber = a;
		if (b<minNumber) {
			minNumber = b;
		}
		if (c<minNumber) {
			minNumber = c;
		}
		return minNumber;
	}

}
