package ch4;

import java.util.Scanner;

public class DowhileExaple {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q")); // 입력한 문자열 q이면 반복문 종료
		
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
