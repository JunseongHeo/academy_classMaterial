package alsong;

public class gugudanPractice {

	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			System.out.println("----"+i+"단----");
			for (int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		
		System.out.println("1부터 100까지의 합");
		int sum = 0;
		for (int i =1; i<=100; i++) {
			sum += i;
		}
		System.out.println("총 합계 : "+sum);
	}
}
