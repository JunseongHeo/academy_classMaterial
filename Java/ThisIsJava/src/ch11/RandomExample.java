package ch11;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���ù�ȣ 
		int[] selectNumber = new int[6];
		Random random = new Random();
		for( int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
		}
		
		// ��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random();
		for(int i = 0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
		}
		
		// ��÷����
		Arrays.sort(selectNumber);
		System.out.println("���ù�ȣ");
		System.out.println(Arrays.toString(selectNumber));

		Arrays.sort(winningNumber);
		System.out.println("��÷��ȣ");
		System.out.println(Arrays.toString(winningNumber));
		
		System.out.println();
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("��÷����");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}

}
