package ch11;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); // arr1배열을 arr2배열에 전체 복사
		System.out.println(Arrays.toString(arr2));
		
		//방법 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3)); // arr1[1]~arr1[2]를 arr3배열에 복사
		
		//방법 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); // arr1의 0번인덱스부터복사 arr4의 0번인덱스부터붙여넣기 복사길이는 arr1배열길이만큼
		for(int i = 0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
	}
}

