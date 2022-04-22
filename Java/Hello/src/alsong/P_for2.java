package alsong;

import java.util.Scanner;
public class P_for2 {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	int a,b,c,d;
	//do while 반복문으로 짝수이면서 0 이 
	//아닐 때 재입력 할수 있게 만든 루프이다.
	do {
		System.out.print("출력할 줄수 입력(종료하려면'0'입력) :");
		a=sc.nextInt();
	}while(a %2 == 0 && a !=0);
	//if 조건문으로 0이 아닌 짝수면종료되고 홀수일때만 별찍기 실행
	if(a==0) {
		System.out.print("홀수를 입력해주세요");
		
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
	} // else문 끝
   }
}