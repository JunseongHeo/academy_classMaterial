package ch8_method;

public class FactorialMain {

	public static void main(String[] args) {

		Factorial f = new Factorial();
		int result = f.compute(5);
		System.out.println("result = "+result);
		
		
		int y=1;
		for (int z=5; z>=1; z--) {
			if (z == 1) {
				z = 1;
				break;
			}
			y = y * z;
		}
		
		System.out.println(y);
		
	}

}
