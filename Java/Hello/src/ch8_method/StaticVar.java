package ch8_method;

public class StaticVar {
	static int a=1; // static �ʱ�ȭ�� �ѹ��� ����. ȣ���Ҷ����� ������
	int b=1; // �Ϲݸ�������� ȣ���Ҷ����� �ʱ�ȭ
	
	void staticTest() {
		a++;
		b++;
		System.out.println("static var a = "+a);
		System.out.println("non static var b = "+b);
	}
	
	
}
