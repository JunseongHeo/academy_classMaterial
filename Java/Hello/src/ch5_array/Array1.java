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
		// �迭�� �ε��������� 2�����ε� j���� 3���� �ԷµǾ� ������ ���
			System.out.println(arr[j]);
		}
		
		int[] arr3 = {1, 2, 3};
		for (int k = 0; k < arr3.length; k++ ) { 
			// �迭.length�� �迭�� �������� ������
			System.out.println(arr[k]);
		}
		
		
 	}
}
