package ch8_method;

public class ArrParamMain {

	public static void main(String[] args) {
		ArrParam ap = new ArrParam(); // ��ü ap����
		
		int[] arr1 = { 1, 2, 3, 4, 5 }; // �迭 arr1 ����
		ap.makeMax(arr1); // ��ü ap�� �޼���makeMax����. �Ķ���ʹ� arr1
		ap.makeSum(arr1);
		ap.makeAvg(arr1);
		System.out.println("arr1�� max = " +ap.max); 
		// ��ü�� max �������. ���� ��ü�� �޼��带 �����Ű�� �ʾҴٸ�, �ʱⰪ�� ��µ�.
		System.out.println("arr1�� sum = " +ap.sum);
		System.out.println("arr1�� avg = " +ap.avg);

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ap.makeMax(arr2);
		ap.makeSum(arr2);
		ap.makeAvg(arr2);
		System.out.println("arr2�� max = " +ap.max);
		System.out.println("arr2�� sum = " +ap.sum);
		System.out.println("arr2�� avg = " +ap.avg);
	
	}

}
