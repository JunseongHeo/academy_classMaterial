package ch11_inheritance;

public class Practice {
	
	public String name;
	public String[] pen;
	protected String pencil = "�⺻ HB ����";
	private String eraser = "�⺻ �ö�ƽ ���찳";

	public Practice() {
		System.out.println("�Ķ� ������ ���빰�� ������ �����ϴ�.");
	}
	
	public void print() {
		for (int i = 0; i<pen.length; i++) {
			System.out.println("���� ���� : " + pen[i]);
		}
		System.out.println("���� ���� : " +pencil);
		System.out.println("���찳 ���� : " +eraser);
	}
	public String[] getPen() {
		return pen;
	}
	
	public void setPen(String[] pen) {
		this.pen = pen;
	}

}
