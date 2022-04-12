package ch4_control;

public class For4 {

	public static void main(String[] args) {
		int i, j;
		// 구구단 2~9단 출력
		
		for(i=2; i<10; i++) {  // 단수
			for (j=1; j<10; j++) { // 단*1~9
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}

}
