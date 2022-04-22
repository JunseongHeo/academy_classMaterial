package ch8_method;

public class StaticMethod {
	static int a;
	int b;
	
	static void test (int x) {
		int sum = 0;
//		 sum = a+b+x; // b는 일반멤버변수라 static 메서드로 불러올수 없음
		
		sum = a + x ;
		System.out.println("sum = " +sum);
//		 test2();	// test2()메서드는 스테틱메서드가 아니라 불러올수가 없음
		
		test3();
	}
	
	void test2() {
		System.out.println("test2");
	}
	static void test3() {
		System.out.println("test3");
	}
	
	
	
}
