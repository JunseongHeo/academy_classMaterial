package ch9_classDesign;

public class Member4 {
	String name;
	String tel;
	String address;
	 
	Member4(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	Member4 getMember4() {
		return this; // ���� ��ü ��ȯ
	}
	
	void print () {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
}
