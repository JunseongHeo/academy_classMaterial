package ch4;

import java.util.Scanner;

public class DowhileExaple {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q")); // �Է��� ���ڿ� q�̸� �ݺ��� ����
		
		
		System.out.println();
		System.out.println("���α׷� ����");
	}
}
