package ch2;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // Double num3 = num2; 코드바꿔주면 정밀도손실x
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
		
		
		
	}

}
