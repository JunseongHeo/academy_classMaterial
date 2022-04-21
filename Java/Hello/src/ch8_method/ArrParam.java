package ch8_method;

public class ArrParam {

		int max;
		int sum;
		float avg;
		
	void makeMax(int[] arr) {
		max = arr[0];
		for (int i =1; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
	}
	
	void makeSum(int[] arr) {
		int i;
		sum = 0;
		for (i=0; i<arr.length; i++) {
			sum += arr[i];
		}
	}
	
	void makeAvg(int[] arr) {
		makeSum(arr);
		avg = (float) sum / arr.length;
	}
	
}
