//��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
//version 0.2
package Info;

import java.util.Scanner;

public class PhoneBookVer02 {
	static Scanner keyboard = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("�����ϼ���..");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷�����");
		System.out.print("���� : ");
	}
	public static void readData() {
		System.out.print("�̸� : ");
		String name = keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String tel = keyboard.nextLine();
		System.out.print("������� : ");
		String birth = keyboard.nextLine();
	
		PhoneInfo info = new PhoneInfo(name, tel, birth);
		System.out.println("\n�Էµ� ���� ���...");
		info.showPhoneInfo();
	}
	public static void main(String[] args) {
		int choice;
		while (true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch (choice) {
			case 1:
				readData();
				break;
			case 2:
				System.out.println("�ý����� �����մϴ�.");
				return;
			}
		}
	}
}
