package alsong;

import java.util.Scanner;
public class P_for2 {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	int a,b,c,d;
	//do while �ݺ������� ¦���̸鼭 0 �� 
	//�ƴ� �� ���Է� �Ҽ� �ְ� ���� �����̴�.
	do {
		System.out.print("����� �ټ� �Է�(�����Ϸ���'0'�Է�) :");
		a=sc.nextInt();
	}while(a %2 == 0 && a !=0);
	//if ���ǹ����� 0�� �ƴ� ¦��������ǰ� Ȧ���϶��� ����� ����
	if(a==0) {
		System.out.print("Ȧ���� �Է����ּ���");
		
	}else {
		b=(a+1)/2;
		c=d=b;
		System.out.println();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=d;j++) {
				if(j<c)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
			if(i<b) {
				c--;
				d++;
			}else {
				c++;
				d--;
			}
		}
	} // else�� ��
   }
}