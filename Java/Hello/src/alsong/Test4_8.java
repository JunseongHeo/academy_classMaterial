// ���� ���� ������ŭ *�� +�� ������ ���� ǥ���ϴ� ���α׷��� �ۼ�����
// ���������� �ٹٲ� ���� ����Ұ�

package alsong;

import java.util.Scanner;

public class Test4_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����ϰ� ���� *+ ������ �Է����ּ���.");
		
		int amount = scanner.nextInt();
		
		if( amount > 0) {
			int i = 0;
			while(i < amount ) {
				if ( i % 2 == 0) { // ¦����° �����̸� *���. 0�������̹Ƿ� *���� ����
					System.out.print("*");
				} else {
					System.out.print("+");
				}
				i++;
			}
		System.out.println();	
		}
	}
}
