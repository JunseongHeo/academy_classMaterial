package ch7_class;

public class Shape {
	Point p = new Point();  // point�� ��ü�� ������� p�� �����ϰ� ����.
			// ������� p�� ��ü, new�� ���־�� �޸� �Ҵ�
	
	void draw() {
		System.out.println("x��ǥ : " +p.x);
		System.out.println("x��ǥ : " +p.y);
	}
	
}
