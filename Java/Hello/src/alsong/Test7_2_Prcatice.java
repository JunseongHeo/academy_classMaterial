// �迭�� Ȱ���Ͽ� 
// n���� int �� �μ� a, b, c �� �ּڰ��� ���ϴ� min �޼��带 �ۼ�����.
// �Լ� ���� ���� int min(int a, int b, int c)
package alsong;

import java.util.Scanner;

public class Test7_2_Prcatice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��� ���ڸ� ���ϰ� �����Ű���? ������ �Է����ּ���");
		int count = scanner.nextInt();
		
		System.out.println("�ּڰ��� ���ϰ���� ���� "+count+"���� �Է����ּ���");

		int[] arr = new int[count];

		for (int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"��° �Է� ���� : ");
			arr[i] = scanner.nextInt();
		}
		System.out.println();
		
		//��´�
//		System.out.println(arr); // �迭�� �ּҰ��� ȣ���
		System.out.println("�ּڰ��� "+min(arr)+"�Դϴ�."); // �迭�� �Ű��������ϴ� �޼ҵ带 ȣ���Ҷ����� �迭�� ��� ȣ��
	}
	
	// �ּڰ� �� �˰��� �޼ҵ�
	public static int min(int[] arr) {
		int minNumber = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (minNumber > arr[i]) {
				minNumber = arr[i];
			}
		}
		return minNumber;
	}
}
