package ch12_polymorphism;

public class UpCastingParent {
	protected int x; // ������� ����.
	protected int y; // ������� ����.
	protected int s=30; // ������� ����.
	
	public UpCastingParent() { // �����ڷ� ��������� �ʱ�ȭ
		x = 10;
		y = 20;
	}
	
	public int add() { // ��������� ���� ��ȯ�ϴ� �޼��带 ����
		System.out.println("parent�� add()");
		return x+y;
	}
}
