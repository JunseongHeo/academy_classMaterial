package ch14;

public class WrapTestMain {
	public static void main(String[] args) {
		WrapTest t = new WrapTest();
		
		// new Integeer(10) Integer��ü�� �����ϴ� �ڵ��
		// �����ڿ� ���� 10�� �����Ͽ� 10�� ������ ���� Integer ��ü�� ����
		t.add(new Integer(10)); // 10~13�� ���� WrapTest�� add�޼����
		t.add(new Integer(25)); // arr�迭�� Integer��ü�� Float��ü�� �߰�
		t.add(new Float(3.56f)); 
		t.add(new Float(56.123f)); 
		t.print(); // arr �迭 ��Ҹ� ���
		System.out.println();
		
		String str1 = "123"; // 17~18�� ���� String ��ü�� �����Ͽ� ���� ���ڿ��� ����
		String str2 = "456"; // "123"�� ���ڷ� �������� ���ڿ�
		int x = Integer.parseInt(str1); // 19~20�� ���ڹ��ڿ��� �������ڷ� ��ȯ
		int y = Integer.parseInt(str2); 
		System.out.println("���ڿ��� �� : "+str1+str2);
		System.out.println("���ڵ��� �� : "+(x+y));
	}
}
