package ch13_abstract;

public abstract class Parent extends GrandParent {
	
	@Override
	public void print() {
		System.out.println("parent");
		System.out.println("name = "+name);
	}
	// GP�� print �޼��常 �����ϰ� test�� �������� �ʾ� 
	// P�� �߻�Ŭ�����̸�, ��ü�� ���� �� ����.
}
