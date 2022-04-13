package ch5_array;

public class Arr5 {

	public static void main(String[] args) {
		int[][] arr = { {1, 2, 3}, {4, 5, 6} };
		int i, j;
		for (i = 0; i < arr.length; i++) { // arr.length == 2
			for (j = 0; j < arr[i].length; j++) { // arr[i].length == 3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
