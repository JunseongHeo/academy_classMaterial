package ch11;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//��� 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); // arr1�迭�� arr2�迭�� ��ü ����
		System.out.println(Arrays.toString(arr2));
		
		//��� 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3)); // arr1[1]~arr1[2]�� arr3�迭�� ����
		
		//��� 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); // arr1�� 0���ε������ͺ��� arr4�� 0���ε������ͺٿ��ֱ� ������̴� arr1�迭���̸�ŭ
		for(int i = 0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
	}
}

