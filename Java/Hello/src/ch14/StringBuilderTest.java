package ch14;

import java.util.Scanner;

public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i;
		for(i = 0; i < 3; i++ ) {
			System.out.println("�ܾ �Է��϶�");
			sb.append(scanner.next());
		}
		System.out.println(sb); // ù��� 3���� �״�� �̾
		
		sb.delete(3, 5); // �ε���4,5 ����
		System.out.println(sb);
		
		sb.insert(3, "xxx"); // �ε���3�� "xxx" ����
		System.out.println(sb);
		
		sb.replace(3, 5, "yyy");
		System.out.println(sb); // �ε���3~5 ��ü
		
		scanner.close();
	}
}
