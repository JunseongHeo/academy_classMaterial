package ch8_method;

public class StaticMethod {
	static int a;
	int b;
	
	static void test (int x) {
		int sum = 0;
//		 sum = a+b+x; // b�� �Ϲݸ�������� static �޼���� �ҷ��ü� ����
		
		sum = a + x ;
		System.out.println("sum = " +sum);
//		 test2();	// test2()�޼���� ����ƽ�޼��尡 �ƴ϶� �ҷ��ü��� ����
		
		test3();
	}
	
	void test2() {
		System.out.println("test2");
	}
	static void test3() {
		System.out.println("test3");
	}
	
	
	
}
