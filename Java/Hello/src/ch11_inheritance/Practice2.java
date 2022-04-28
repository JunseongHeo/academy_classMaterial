package ch11_inheritance;

public class Practice2 extends Practice {
	private String pen2="채점용 색연필";
	
	public Practice2() {
		System.out.println("빨간 필통의 내용물은 다음과 같습니다.");
		System.out.println("빨간 문구 "+pen2+"가 추가되었습니다.");
	}
	public void print2() {
		for (int i = 0; i<pen.length; i++) {
			System.out.println("펜의 종류 : " + pen[i]);
		}
		System.out.println("연필 종류 : " +pencil);
	}

}
