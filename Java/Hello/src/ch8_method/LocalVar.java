package ch8_method;

public class LocalVar {
	int memVar; // �������. ������ �ʱ�ȭ ���ϸ� �⺻�� 0.
	
	void localTest() { // �޼��� localTest ����
		int a = 10, c;; //��������
	{
		int b = 20; // ��� �� ��������
		System.out.println("��� ��");
		System.out.println(" a = "+a+", b= "+b);
	}
		//System.out.println(" a = "+a+", b= "+b); // �����߻�
		
		int b = 30;
		System.out.println("��� ��");
		System.out.println(" a = "+a+", b= "+b);
		
		//System.out.println(" a = "+a+", b= "+b+", c= "+c ); // �����߻�
		
		// memVar������ ��������� 0���� �ڵ��ʱ�ȭ
		System.out.println("�� �Ҵ� ���� memVar = "+memVar);
		memVar = 100;
		System.out.println("�� �Ҵ� ���� memVar = "+memVar);
		} // �޼��� localTest ��
	
	void printVar() {
		System.out.println("memVar = " + memVar);
//		System.out.println(" a = "+a+", b= "+b); // �����߻�
	}
	
}
