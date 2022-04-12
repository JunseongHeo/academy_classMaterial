package ch5_array;

import java.util.Arrays;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		System.out.println(arr[0][1]);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j< arr.length; j++) {
				arr[i][j] = j+(i*arr.length);
			}
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
		
	}	

}
