package ch7;

public class Child01Example {
	public static void main(String[] args) {
		Parent01 parent = new Child01();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
	//	parent.field2 = "data2"; // �Ұ���
	//	parent.method3(); // �Ұ���
		
		Child01 child = (Child01) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
