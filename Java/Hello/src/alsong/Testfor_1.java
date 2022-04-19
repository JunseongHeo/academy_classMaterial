// 2g, 3g, 5g 추를 이용해서 원하는 무게 만들기
// 10개씩 있는 2g, 3g, 5g짜리 추를 조합하여 81g을 만들어보자
// if문과 중첩 for문을 이용하자

package alsong;

public class Testfor_1 {

	public static void main(String[] args) {
		int n = 81;
		int fiveCount=0;
		int threeCount=0;
		int twoCount=0;
		
		for (fiveCount=0; fiveCount<10; fiveCount++) {
			n = n-5;
			for (threeCount=0; threeCount<10; fiveCount++) {
				n = n-3;
			}
		}
		
		System.out.println(n);
		
		System.out.println("5g 추 : "+ fiveCount + "\n3g 추 : " + threeCount + "\n2g 추 : " + twoCount);
	}
}

