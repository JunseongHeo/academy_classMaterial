// 월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자
package alsong;

import java.util.Scanner;

public class Test3_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요. 해당 월의 계절을 표시합니다.");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1: case 2: case 12:
			System.out.println("겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("봄 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
			
		default:
			System.out.println("잘못입력하셨습니다. 몇월인지 숫자만 입력해주세요");
			break;
		}
		
	}

}
