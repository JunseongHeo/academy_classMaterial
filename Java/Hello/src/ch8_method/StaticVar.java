package ch8_method;

public class StaticVar {
	static int a=1; // static 초기화는 한번만 실행. 호출할때마다 누적됨
	int b=1; // 일반멤버변수는 호출할때마다 초기화
	
	void staticTest() {
		a++;
		b++;
		System.out.println("static var a = "+a);
		System.out.println("non static var b = "+b);
	}
	
	
}
