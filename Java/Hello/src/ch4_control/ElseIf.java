package ch4_control;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int jumsu;
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하라");
		jumsu = scanner.nextInt();
		
		if(jumsu>=90) {
			System.out.println("A");
		} else if(jumsu>=80) {
			System.out.println("B");
		} else if(jumsu>=70) {
			System.out.println("C");
		} else if(jumsu>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
	}

}
