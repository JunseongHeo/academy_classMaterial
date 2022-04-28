// 2개의 변수 a, b값을 읽어서 a, b의 대소관계를 다음과 같이 표시하는 프로그램을 작성하자
// "a가 크다", "b가 크다", "a와 b가 같다"

package alsong;

import java.util.Scanner;

public class Test3_7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("크기를 비교할 두 정수 a,b를 입력해주세요");
		
		int a = scanner.nextInt();
		System.out.println("입력하신 첫번째 수 a는 "+a+"입니다.");
		
		int b = scanner.nextInt(); 
		System.out.println("입력하신 첫번째 수 b는 "+b+"입니다.");

		System.out.println("\n입력하신 두 수 "+a+"와 " +b+"를 비교합니다.");
		if(a > b ) {
			System.out.println("a가 큽니다.");
		} else if (a == b) {
			System.out.println("a는 b와 같습니다.");
		} else {
			System.out.println("b가 큽니다.");
		}
	}
}
