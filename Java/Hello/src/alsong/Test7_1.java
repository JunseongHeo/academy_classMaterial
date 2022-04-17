// 입력한 int형 정수값이 음수이면 -1,
// 0이면 0, 양수이면 1을 반환하는 sigh Of 메서드를 작성하자.

package alsong;

import java.util.Scanner;

public class Test7_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정수 x : ");
		int x = scanner.nextInt();
		
		int s = signOfMethod(x);
		System.out.println("signOf(x)는 "+s+"입니다.");
	}
	public static int signOfMethod(int n) {
		int sign = 0;
		
		if (n > 0) {
			sign = 1;
		} else if (n == 0) {
			sign = 0;
		} else {
			sign = -1;
		}
		return sign;
	}
}
