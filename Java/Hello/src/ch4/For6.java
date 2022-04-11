package ch4;

public class For6 {

	public static void main(String[] args) {
		int i, j;
		for ( i=0; i<10; i++) { // 단수*1~9
			for ( j=2; j<10; j++) { //단수
				if (i==0) { // 제목줄 출력
					System.out.print(j+"단\t");
				} else {
					System.out.print(j+"*"+i+"="+(j*i+"\t"));
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		
	}

}
