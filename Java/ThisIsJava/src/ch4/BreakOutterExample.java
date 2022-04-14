package ch4;

public class BreakOutterExample {

	public static void main(String[] args) {
		// 반복문 이름(라벨)
		Outter : for (char upper = 'A'; upper <= 'Z'; upper++) { 
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower=='g') {
					break Outter; // Outter란 이름의 반복분으로부터 탈출
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
