// 2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다"라고 표시하고,
// 그렇지 않으면 "B는 A의 약수가 아니다."라고 표시하는 프로그램을 작성하자

package alsong;

import java.util.Scanner;

public class Test_divide {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2개의 양의 정숫값을 입력해주세요");
		
		int a = scanner.nextInt();
		System.out.println("첫번째로 입력한 정수 A는 "+a+"입니다.");
		
		int b = scanner.nextInt();
		System.out.println("첫번째로 입력한 정수 B는 "+b+"입니다.");
		
		System.out.println();
		if (a%b == 0 ) {
			System.out.println("B는 A의 약수입니다.");
		} else {
			System.out.println("B는 A의 약수가 아닙니다.");
		}
	}
}
