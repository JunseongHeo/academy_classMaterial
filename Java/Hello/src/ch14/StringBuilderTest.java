package ch14;

import java.util.Scanner;

public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i;
		for(i = 0; i < 3; i++ ) {
			System.out.println("단어를 입력하라");
			sb.append(scanner.next());
		}
		System.out.println(sb); // 첫출력 3개를 그대로 이어서
		
		sb.delete(3, 5); // 인덱스4,5 제거
		System.out.println(sb);
		
		sb.insert(3, "xxx"); // 인덱스3에 "xxx" 삽입
		System.out.println(sb);
		
		sb.replace(3, 5, "yyy");
		System.out.println(sb); // 인덱스3~5 대체
		
		scanner.close();
	}
}
