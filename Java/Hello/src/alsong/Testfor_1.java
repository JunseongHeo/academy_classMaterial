// 2g, 3g, 5g �߸� �̿��ؼ� ���ϴ� ���� �����
// 10���� �ִ� 2g, 3g, 5g¥�� �߸� �����Ͽ� 81g�� ������
// if���� ��ø for���� �̿�����

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
		
		System.out.println("5g �� : "+ fiveCount + "\n3g �� : " + threeCount + "\n2g �� : " + twoCount);
	}
}

