package ch4;

public class For1 {

	public static void main(String[] args) {
		int i, sum = 0;
		
		System.out.println("1~100까지의 합");
		
		for ( i = 1; i<=100; i++) {
			sum +=i; // sum+=i는 sum = sum+i의 축약
		}
		System.out.println("sum ="+sum);
		
	}

}
