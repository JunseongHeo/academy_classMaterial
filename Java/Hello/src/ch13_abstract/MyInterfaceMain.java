package ch13_abstract;

public class MyInterfaceMain {

	public static void main(String[] args) {
		MyImplements m = new MyImplements();
		m.mul();
		System.out.println("add()의 구현결과 = "+m.add());
	}
}
