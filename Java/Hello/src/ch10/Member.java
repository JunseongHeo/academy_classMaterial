package ch10;

public class Member {
	private String name; // ����� ��� private, 
	private String tel;  // ���� Ŭ������ ��������� private�� ������ 
	private String address; // �ܺ� ������ ���� �����Ǵ� ���� ���´�.
	
	public void printMember() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
	public void setInfo(String name, String tel, String address) { // ������� name�� setter�� Ŭ���� �ۿ��� �־��� �Ķ���� ���� name�� �Ҵ�
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public String getName() { // ������� name�� getter�� Ŭ���� �ۿ��� name���� ���� �� ȣ��. 
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
}
