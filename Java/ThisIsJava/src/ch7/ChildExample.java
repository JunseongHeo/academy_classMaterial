package ch7;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1(); // parent의 메서드1 호출
		parent.method2(); // 재정의된 메서드 호출
//		parent.method3(); // 호출 불가능
	}

}
