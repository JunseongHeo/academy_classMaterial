// 정수값을 읽어 부호(양수/음수/0)을 판정하는 프로그램을 작성하자

package alsong;

import java.util.Scanner;

public class Test3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요. '양수/0/음수'를 판독합니다.");
		int a = scanner.nextInt();
		
		if ( a > 0) {
			System.out.println("양수 입니다.");
		} else if( a == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
		
		
	}
}
