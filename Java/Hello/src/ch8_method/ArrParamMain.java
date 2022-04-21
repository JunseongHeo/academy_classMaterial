package ch8_method;

public class ArrParamMain {

	public static void main(String[] args) {
		ArrParam ap = new ArrParam(); // 객체 ap생성
		
		int[] arr1 = { 1, 2, 3, 4, 5 }; // 배열 arr1 생성
		ap.makeMax(arr1); // 객체 ap에 메서드makeMax실행. 파라미터는 arr1
		ap.makeSum(arr1);
		ap.makeAvg(arr1);
		System.out.println("arr1의 max = " +ap.max); 
		// 객체의 max 변수출력. 만약 객체에 메서드를 실행시키지 않았다면, 초기값이 출력됨.
		System.out.println("arr1의 sum = " +ap.sum);
		System.out.println("arr1의 avg = " +ap.avg);

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ap.makeMax(arr2);
		ap.makeSum(arr2);
		ap.makeAvg(arr2);
		System.out.println("arr2의 max = " +ap.max);
		System.out.println("arr2의 sum = " +ap.sum);
		System.out.println("arr2의 avg = " +ap.avg);
	
	}

}
