package ch5_array;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {
		// �� ����� ����, ����, ���� ������ ������ �迭 ����
		int[][] jumsu = new int[3][4];
		
		// Ÿ��Ʋ�� ����� ���ڿ� ���
		String[] title = { "����", "����", "����", "����"};
		
		Scanner scanner = new Scanner(System.in);
		
		int i, j;
		
		for (i=0; i<jumsu.length; i++) {
			// �� ���� ���� ĭ�� 0���� �ʱ�ȭ
			jumsu[i][3] = 0;
			// ������ ������ �Է¹ް� ������ ���Ѵ�.
			System.out.println(i+"��° ���� ���� �Է�");
			for (j=0; j<jumsu[i].length-1;j++) { // jumsu[i].length-1�� ��������
				System.out.print(j+"��° ���� �����Է�");
				jumsu[i][j] = scanner.nextInt();
				// �Է¹��� ������ ����ĭ�� ����
				jumsu[i][3] += jumsu[i][j];
			}
			System.out.println();
		}
		// ��� Ÿ��Ʋ ���
		for (i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();

		// ��� ���
		for (i=0; i<jumsu.length; i++) {
			for (j=0; j<jumsu[i].length;j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
