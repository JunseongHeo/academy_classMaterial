// 3개의 int 형 인수 a, b, c 중 최솟값을 구하는 min 메서드를 작성하자.
// 함수 원형 선언 int min(int a, int b, int c)

package alsong;

import java.util.Scanner;

public class Test7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("최솟값을 구하고싶은 정수 3개를 입력해주세요");

		System.out.print("정수 a : ");
		int a = scanner.nextInt();
		System.out.print("정수 b : ");
		int b = scanner.nextInt();
		System.out.print("정수 c : ");
		int c = scanner.nextInt();
		System.out.println("최솟값은 "+minMethod(a,b,c)+" 입니다.");
		}

	public static int minMethod(int a, int b, int c) {
		int minNumber = a;
		if (b<minNumber) {
			minNumber = b;
		}
		if (c<minNumber) {
			minNumber = c;
		}
		return minNumber;
	}

}
