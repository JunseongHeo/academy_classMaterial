package ch11;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택번호 
		int[] selectNumber = new int[6];
		Random random = new Random();
		for( int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
		}
		
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random();
		for(int i = 0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
		}
		
		// 당첨여부
		Arrays.sort(selectNumber);
		System.out.println("선택번호");
		System.out.println(Arrays.toString(selectNumber));

		Arrays.sort(winningNumber);
		System.out.println("당첨번호");
		System.out.println(Arrays.toString(winningNumber));
		
		System.out.println();
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
