package ch9_classDesign;

public class Member4Main {

	public static void main(String[] args) {
		ThisTest t = new ThisTest();
		Member4 m1 = new Member4("aaa", "111", "서울");
		t.setMember4(m1.getMember4());
		t.print();
		System.out.println("m1끝----------------------");
		
		Member4 m2 = new Member4("bbb", "222", "경기");
		t.setMember4(m2.getMember4());
		t.print();
		System.out.println("m2끝----------------------");
		
		
		Member4 m3 = new Member4("ccc", "333", "강원");
		t.setMember4(m3.getMember4());
		t.print();
		
		
		
	}

}
