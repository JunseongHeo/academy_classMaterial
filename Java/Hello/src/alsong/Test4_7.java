// 입력한 값의 개수만큼 '*'를 표시하는 프로그램을 작성하자
// 마지막에는 줄바꿈 문자를 출력할것
// 단, 읽은 값이 1미만이면 줄바꿈 문자를 표시해서는 안된다.

package alsong;

import java.util.Scanner;

public class Test4_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("표시하고싶은 *의 숫자를 입력해주세요.");
		int amount = scanner.nextInt();
		
		if ( amount >= 1 ) {
			for (int i = 0; i<amount; i++) {
				System.out.print("*");
			}
			System.out.println();
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}  // while문 활용하여 작성할 수 있다.
}
