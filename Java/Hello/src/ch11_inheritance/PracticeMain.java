package ch11_inheritance;

public class PracticeMain {

	public static void main(String[] args) {
		Practice myPencil = new Practice();
		
		myPencil.setPen(new String[] {"»¡°£Ææ", "ÃÊ·Ï Çü±¤Ææ", "±î¸¸ º¼Ææ"});
		myPencil.print();
		
		System.out.println("-------------");
		Practice2 myPencil2 = new Practice2();
		myPencil2.setPen(new String[] {"»¡°£Çü±¤Ææ", "»¡°£º¼Ææ", "»¡°£»ö¿¬ÇÊ"});
		myPencil2.print2();
		
	}
}
