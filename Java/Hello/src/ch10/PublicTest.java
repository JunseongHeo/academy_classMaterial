package ch10;

public class PublicTest {
	public int x;
	private int y; // Ŭ���� �������� ���ٰ��� 
	
	public PublicTest ( int x , int y ) { // ������
		this.x = x;
		this.y = y; // private ���. Ŭ���� �ȿ����� ���ٰ���
	}
	public void print() {
		setValue(); // private ��� ȣ��. Ŭ���� �ȿ����� ���� ����
		System.out.println("x = "+x+" , y = "+y);
	}
	private void setValue() { // setValue �������� �����ϴ� private
		x = 100;			// Ŭ���� �������� ����
		y = 100;
	}
}
