// ��� ������ 5���� int�� �迭�� ������� 5,4,3,2,1�� �����ϴ� ���α׷��� �ۼ�����

package alsong;

public class Test6_6 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for (int i=0; i<arr.length;i++) {
			arr[i] = arr.length-i;
		}

		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
