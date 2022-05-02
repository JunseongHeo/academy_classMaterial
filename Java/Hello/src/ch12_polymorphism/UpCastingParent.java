package ch12_polymorphism;

public class UpCastingParent {
	protected int x; // 멤버변수 선언.
	protected int y; // 멤버변수 선언.
	protected int s=30; // 멤버변수 선언.
	
	public UpCastingParent() { // 생성자로 멤버젼수를 초기화
		x = 10;
		y = 20;
	}
	
	public int add() { // 멤버젼수의 합을 반환하는 메서드를 선언
		System.out.println("parent의 add()");
		return x+y;
	}
}
