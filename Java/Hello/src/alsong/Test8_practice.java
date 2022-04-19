// 소인수분해

package alsong;

import java.util.Scanner;

public class Test8_practice {

	public static void main(String[] args) {
		int k = 2; // 2부터 1씩 증가하는 숫자
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수분해할 수를 입력해주세요");
		int num=scanner.nextInt();
		
		while(num != 1) {
			if ( num % k == 0) {
				System.out.println(k);
				num /= k;
			} else {
				k++;
			}
		}
	}
}
