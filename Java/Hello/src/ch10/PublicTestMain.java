package ch10;

public class PublicTestMain {

	public static void main(String[] args) {
		PublicTest t = new PublicTest(10, 10);
		t.x = 20; // public 멤버는 클래스 밖에서도 접근가능
		// y는 private 멤버기 때문에 클래스 밖에서는 접근 불가
//		t.y = 20; 
		//private 멤버. 접근 불가
//		t.setValue() 
		t.print(); // public 멤버. 접근 가능
	}
}
