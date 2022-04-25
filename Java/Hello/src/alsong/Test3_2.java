// 정숫값을 읽어서 절댓값을 구하는 프로그램을 작성하자

package alsong;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("절댓값을 구하려는 정수값을 입력해주세요");
		int absolute = scanner.nextInt();
		
		if(absolute >= 0) {
			System.out.println("절댓값 : "+ absolute);
		} else {
			System.out.println("절댓값 : "+ -absolute);
		}
		
	}
}
