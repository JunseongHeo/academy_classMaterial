// 2���� ���� a, b���� �о a, b�� ��Ұ��踦 ������ ���� ǥ���ϴ� ���α׷��� �ۼ�����
// "a�� ũ��", "b�� ũ��", "a�� b�� ����"

package alsong;

import java.util.Scanner;

public class Test3_7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ũ�⸦ ���� �� ���� a,b�� �Է����ּ���");
		
		int a = scanner.nextInt();
		System.out.println("�Է��Ͻ� ù��° �� a�� "+a+"�Դϴ�.");
		
		int b = scanner.nextInt(); 
		System.out.println("�Է��Ͻ� ù��° �� b�� "+b+"�Դϴ�.");

		System.out.println("\n�Է��Ͻ� �� �� "+a+"�� " +b+"�� ���մϴ�.");
		if(a > b ) {
			System.out.println("a�� Ů�ϴ�.");
		} else if (a == b) {
			System.out.println("a�� b�� �����ϴ�.");
		} else {
			System.out.println("b�� Ů�ϴ�.");
		}
	}
}
