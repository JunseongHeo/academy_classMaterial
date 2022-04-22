package ch8_method;

public class Factorial {

		int compute(int x) {
			if ( x==1 ) {
				return 1;
			} else {
				return x * compute(x-1);
			}
		}

}
		
		
