package ch13_abstract;

import java.util.Scanner;

public class StrEqualsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String id = "gjwnstjd"; // id�� pwd�� ���Ѵ�.
		String pwd = "123456";
		
		System.out.print("id : "); // ����ڷκ��� ���̵�� �н����带 �Է¹޴´�.
		String id_str = scanner.next();
		
		System.out.print("pwd : ");
		String pwd_str = scanner.next();
		
		// String Ŭ������ equals�� ���ڿ��� ���������� ���Ͽ� ��ҹ��ڸ� ����
		if ( id.equals(id_str) && pwd.equals(pwd_str)) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		scanner.close();
	}
}
