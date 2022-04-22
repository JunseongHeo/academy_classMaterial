package ch8_method;

public class LocalVarMain {

	public static void main(String[] args) {
		LocalVar lv = new LocalVar();
		lv.localTest();
//		System.out.println(" a = "+a+", b= "+b);  // 에러발생
		lv.printVar();
		lv.memVar = 500; // 멤버변수 memVar를 500으로 초기화
		lv.printVar();
		
	}

}
