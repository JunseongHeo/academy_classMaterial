package ch4_control;

public class For1 {

	public static void main(String[] args) {
		int i, sum = 0;
		
		System.out.println("1~100������ ��");
		
		for ( i = 1; i<=100; i++) {
			sum +=i; // sum+=i�� sum = sum+i�� ���
		}
		System.out.println("sum ="+sum);
		
	}

}