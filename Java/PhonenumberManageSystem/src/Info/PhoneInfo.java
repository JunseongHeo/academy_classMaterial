package Info;

public class PhoneInfo {
	
	public String name; // �̸�
	public String phoneNumber; // ��ȭ��ȣ
	public String birth; // �������
	
	// ������
	public PhoneInfo(String name, String phoneNumber, String birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	// ������� �𸦶� ������ ������ �Է�
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	// ��¸޼���
	public void showPhoneInfo() {
		System.out.println("----------------");
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phoneNumber);
		if (birth != null) {
			System.out.println("������� : "+birth);
		}
		System.out.println("----------------");
	}
	
}
