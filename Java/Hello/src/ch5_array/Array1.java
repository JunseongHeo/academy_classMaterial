package ch5_array;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int i;
		for ( i = 0; i <5 ; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		int[] arr2 = {1, 2, 3};
		for (int j = 0; j < 4; j++ ) { 
		// 배열의 인덱스범위는 2까지인데 j값이 3까지 입력되어 범위를 벗어남
			System.out.println(arr[j]);
		}
		
		int[] arr3 = {1, 2, 3};
		for (int k = 0; k < arr3.length; k++ ) { 
			// 배열.length는 배열의 범위값을 가져옴
			System.out.println(arr[k]);
		}
		
		
 	}
}
