package ch11_inheritance;

public class Practice2 extends Practice {
	private String pen2="ä���� ������";
	
	public Practice2() {
		System.out.println("���� ������ ���빰�� ������ �����ϴ�.");
		System.out.println("���� ���� "+pen2+"�� �߰��Ǿ����ϴ�.");
	}
	public void print2() {
		for (int i = 0; i<pen.length; i++) {
			System.out.println("���� ���� : " + pen[i]);
		}
		System.out.println("���� ���� : " +pencil);
	}

}
