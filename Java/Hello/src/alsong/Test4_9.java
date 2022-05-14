// 양의정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자
package alsong;

import java.util.Scanner;

public class Test4_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("자릿수를 구하고 싶은 양의 정숫값을 입력해주세요");
		
		int number = scanner.nextInt();
		int i = 0;
		
		while ( number >= 1) {
			number /= 10;
			i++;
		}
		System.out.println("입력하신 양의정수값의 자릿수는 "+(i)+ "입니다.");
	}
}
