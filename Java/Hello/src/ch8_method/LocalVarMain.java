package ch8_method;

public class LocalVarMain {

	public static void main(String[] args) {
		LocalVar lv = new LocalVar();
		lv.localTest();
//		System.out.println(" a = "+a+", b= "+b);  // �����߻�
		lv.printVar();
		lv.memVar = 500; // ������� memVar�� 500���� �ʱ�ȭ
		lv.printVar();
		
	}

}
