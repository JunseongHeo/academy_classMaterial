// 읽은 값의 개수만큼 *과 +를 번갈아 가며 표시하는 프로그램을 작성하자
// 마지막에는 줄바꿈 문자 출력할것

package alsong;

import java.util.Scanner;

public class Test4_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력하고 싶은 *+ 수량을 입력해주세요.");
		
		int amount = scanner.nextInt();
		
		if( amount > 0) {
			int i = 0;
			while(i < amount ) {
				if ( i % 2 == 0) { // 짝수번째 시작이면 *출력. 0번시작이므로 *부터 시작
					System.out.print("*");
				} else {
					System.out.print("+");
				}
				i++;
			}
		System.out.println();	
		}
	}
}
