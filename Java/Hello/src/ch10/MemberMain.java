package ch10;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.setInfo("�躴��", "666", "�д籸"); 
		// ����� setter�� ȣ���ؼ� private ��� ������ �� �Ҵ�
	
		String name = m.getName(); // m.name
		String tel = m.getTel(); // m.tel
		String address = m.getAddress(); // m.address
		// 13~15�������� ����� getter�� ȣ���ؼ� private ��������� ���� �д´�
		
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
}
