package ch7;

public class InstanceofExample {
	public static void method1 (Parent001 parent) {
		if ( parent instanceof Child001 ) {
			Child001 child = (Child001) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2 ( Parent001 parent ) {
		Child001 child = (Child001) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent001 parentA = new Child001();
		method1(parentA);
		method2(parentA);
		
		Parent001 parentB = new Parent001();
		method1(parentB);
		method2(parentB); // ���ܹ߻�
	}

}
