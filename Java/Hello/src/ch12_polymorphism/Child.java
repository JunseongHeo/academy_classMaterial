package ch12_polymorphism;

public class Child extends Parent{
	private String hobby;
	
	@Override // ������ ������̼�(�����Ϸ� �ּ�)�� �����Ϸ��� ��ӹ��� �޼��带 ���������� �˷���
	
	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("hobby : "+hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
