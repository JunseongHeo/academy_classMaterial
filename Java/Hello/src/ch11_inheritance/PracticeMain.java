package ch11_inheritance;

public class PracticeMain {

	public static void main(String[] args) {
		Practice myPencil = new Practice();
		
		myPencil.setPen(new String[] {"������", "�ʷ� ������", "� ����"});
		myPencil.print();
		
		System.out.println("-------------");
		Practice2 myPencil2 = new Practice2();
		myPencil2.setPen(new String[] {"����������", "��������", "����������"});
		myPencil2.print2();
		
	}
}
