// �迭�� Ȱ���Ͽ� 
// n���� int �� �μ� a, b, c �� �ּڰ��� ���ϴ� min �޼��带 �ۼ�����.
// �Լ� ���� ���� int min(int a, int b, int c)


package alsong;

import java.util.Scanner;

public class Test7_2_Prcatice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��� ���ڸ� ���ϰ� �ͳ���? ������ �Է����ּ���");
		int count = scanner.nextInt();
		
		System.out.println("�ּڰ��� ���ϰ���� ���� "+count+"���� �Է����ּ���");

		int[] arr = new int[count];

		for (int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"��° �Է� ���� : ");
			arr[i] = scanner.nextInt();
		}	
		System.out.println();
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}	
		System.out.println();
		
		//��´�
		min(arr);
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
	
	// �迭 ��� �޼ҵ�
//	public static void printMinNumber(int[] arr) {
//		System.out.print(arr[0]);
//	}
}
