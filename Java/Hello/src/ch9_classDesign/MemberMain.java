package ch9_classDesign;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		m.print();
		m.setMemberData("������", "010-1111-2222", "�ν���������");
		m.print();
	}

}
