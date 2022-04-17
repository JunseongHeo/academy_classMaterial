// 배열을 활용하여 
// n개의 int 형 인수 a, b, c 중 최솟값을 구하는 min 메서드를 작성하자.
// 함수 원형 선언 int min(int a, int b, int c)
package alsong;

import java.util.Scanner;

public class Test7_2_Prcatice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇개의 숫자를 비교하고 싶으신가요? 정수로 입력해주세요");
		int count = scanner.nextInt();
		
		System.out.println("최솟값을 구하고싶은 정수 "+count+"개를 입력해주세요");

		int[] arr = new int[count];

		for (int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 입력 숫자 : ");
			arr[i] = scanner.nextInt();
		}
		System.out.println();
		
		//출력단
//		System.out.println(arr); // 배열의 주소값이 호출됨
		System.out.println("최솟값은 "+min(arr)+"입니다."); // 배열을 매개변수로하는 메소드를 호출할때에는 배열명만 적어서 호출
	}
	
	// 최솟값 비교 알고리즘 메소드
	public static int min(int[] arr) {
		int minNumber = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (minNumber > arr[i]) {
				minNumber = arr[i];
			}
		}
		return minNumber;
	}
}
