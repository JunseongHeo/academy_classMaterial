// 요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램을 작성하자

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
