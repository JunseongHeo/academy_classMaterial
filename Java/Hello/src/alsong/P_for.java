package alsong;
import java.util.Scanner;

public class P_for {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		int n;
		int s; // ���� 3�� ����
		do {
			System.out.print("��� �ټ��Է� :");
			a=sc.nextInt();  // ����� �ټ��� ���� a�� �Է�             
		}while(a<=1); // 1���ϴ� ���Է�
		s=n=a;	// �� ������ ��� ������ ��
		System.out.println(); // �Է��ٿ��� ����
		
		for(int i=1;i<=a;i++) { // a�� �ִ� �ټ�
			for(int j=1;j<=n;j++) {
				if(j<s) { // s�� ����
					System.out.print("s");
				}else {
					System.out.print("j");
				}
			}
			s--;
			n++;
			System.out.println(); // �����ٷ� �Ѿ��
		}
		
	}
}



