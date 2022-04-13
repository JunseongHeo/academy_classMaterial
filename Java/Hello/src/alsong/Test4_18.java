// 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자

package alsong;

import java.util.Scanner;

public class Test4_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("약수와 약수의 개수를 알고싶은 정수값을 입력해주세요");
		int number = scanner.nextInt(); // 입력숫자
		
		int count = 0; // 약수의 개수
		
		for ( int i = 1; i <= number; i++) {
			if ( number%i == 0) { // 나누어떨어지면
				System.out.print(i+", "); //표시
				count++;
			}
		}
		System.out.println("\n입력하신 숫자 "+number+"의 약수의 개수는 "+count+"개 입니다."); // 개수표시
	}
}
