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
	
	public String getName() { // ������� name�� getter�� Ŭ���� �ۿ��� name���� ���� �� ȣ��. 
		return name;
	}
	
	public void setName(String name) { // ������� name�� setter�� Ŭ���� �ۿ��� �־��� �Ķ���� ���� name�� �Ҵ�
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
