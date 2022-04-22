package alsong;
import java.util.Scanner;

public class P_for {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		int n;
		int s; // 변수 3개 선언
		do {
			System.out.print("출력 줄수입력 :");
			a=sc.nextInt();  // 출력할 줄수는 변수 a에 입력             
		}while(a<=1); // 1이하는 재입력
		s=n=a;	// 세 변수는 모두 동일한 값
		System.out.println(); // 입력줄에서 개행
		
		for(int i=1;i<=a;i++) { // a는 최대 줄수
			for(int j=1;j<=n;j++) {
				if(j<s) { // s는 기준
					System.out.print("s");
				}else {
					System.out.print("j");
				}
			}
			s--;
			n++;
			System.out.println(); // 다음줄로 넘어가기
		}
		
	}
}



