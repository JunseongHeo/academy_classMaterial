package newStudy;

import java.util.Scanner;
public class ApplicationExam1_max {
	public static void main(String[] args) {
		// 정수 10개 입력
		System.out.println("최댓값을 구하고 싶은 정수 10개를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			System.out.println((i+1)+"번째 입력 정수 : "+arr[i]);
		}
		// 최댓값 비교 알고리즘
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		// 최댓값 출력
		System.out.println("최댓값은 "+max+"입니다.");
	}
}
