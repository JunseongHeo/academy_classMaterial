package newStudy;

import java.util.Scanner;
public class ApplicationExam1_max {
	public static void main(String[] args) {
		// ���� 10�� �Է�
		System.out.println("�ִ��� ���ϰ� ���� ���� 10���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			System.out.println((i+1)+"��° �Է� ���� : "+arr[i]);
		}
		// �ִ� �� �˰���
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		// �ִ� ���
		System.out.println("�ִ��� "+max+"�Դϴ�.");
	}
}
