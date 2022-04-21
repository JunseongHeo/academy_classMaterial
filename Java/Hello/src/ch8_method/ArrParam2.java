package ch8_method;

public class ArrParam2 {
	int max;
	int sum;
	float avg;
	
	int makeMax(int[] arr) {
		max = arr[0];
		for (int i =1; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
	return max;
	}
	
	int makeSum(int[] arr) {
		int i;
		sum = 0;
		for (i=0; i<arr.length; i++) {
			sum += arr[i];
		}
	return sum;
	}
	
	float makeAvg(int[] arr) {
		makeSum(arr);
		avg = (float) sum / arr.length;
	return avg;
	}
	
}
