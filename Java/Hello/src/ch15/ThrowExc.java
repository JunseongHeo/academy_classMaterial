package ch15;

public class ThrowExc {
	String str = null; // �� Ŭ������ String ������� str�� ���´�.
	
	// �޼��� subStr()�� ������� str�� �Ķ���� idx  ��ġ���� �߶󳽴�.
	// �׷��� ���ڿ� ó�� �� str�� null������ Ȯ���ϰ� null�̸� ���ܸ� �߻��ϰ�
	// null�� �ƴϸ�
	
	public String subStr(int idx) {
		if ( str == null ) {
			System.out.println("str�� null�̴�.");
			throw new NullPointerException();
		} else {
			return str.substring(idx);
		}
	}
	
}
