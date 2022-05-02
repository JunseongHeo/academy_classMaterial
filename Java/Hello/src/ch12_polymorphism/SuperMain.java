package ch12_polymorphism;

public class SuperMain {

	public static void main(String[] args) {
		SuperParent sp = new SuperChild(); // 업캐스팅하여 객체를 생성
		sp.print(); // print()를 호출하면 재정의된 하위클래스의 print() 호출
	} // 하위 클래스인 SuperChild의 print()는 SuperCall을 호출해
	// 상위 클래스의 멤버젼수를 출력하고 메서드를 호출
}
