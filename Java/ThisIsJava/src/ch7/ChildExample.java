package ch7;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1(); // parent�� �޼���1 ȣ��
		parent.method2(); // �����ǵ� �޼��� ȣ��
//		parent.method3(); // ȣ�� �Ұ���
	}

}
