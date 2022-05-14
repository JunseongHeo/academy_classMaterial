package ch16;
							// ���α׷��� �޴��� ��ϴ� Ŭ������ ����¿� �����
import java.util.ArrayList; // Scanner ��ü, ������� �޴��Է°��� ������ menu,
import java.util.Scanner;   // ���α׷��� �ݺ�/���Ḧ ������ flag ��������� ���´�

public class MemberMenu {
	private Scanner scanner = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	private String menuStr = "1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.�������ʱ�ȭ 7.����";
	
	public void menuProcess(ArrayList<Member> data) { 
		int idx = 0;
		while (flag) {
			System.out.println(menuStr);
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				data.add(infoInput());
				break;
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
			case 3:
				editMember(data);
				break;
			case 4:
				delMember(data);
				break;
			case 5:
				for ( idx=0; idx<data.size(); idx++) {
					printMember(data.get(idx));
				}
				break;
			case 6:
				data.removeAll(data);
				break;
			case 7:
				System.out.println("���α׷��� �����մϴ�.");
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	public Member infoInput() { // ����ڷκ��� name, tel, address�� �Է¹޾� 
		System.out.println("�̸�"); // Member��ü�� �����Ͽ� ��ȯ�Ѵ�.
		String name = scanner.next(); // case 1:���� �� �޼��带 ȣ����
		System.out.println("��ȭ��ȣ"); // ���ѹ��� Member ��ü�� ����Ʈ�� �߰��Ѵ�.
		String tel = scanner.next(); 
		scanner.nextLine();
		System.out.println("�ּ�");
		String address = scanner.nextLine();
		return new Member(name, tel, address);
	}
	public int search(ArrayList<Member> data) { // �˻��� ����ϴ� �޼���
		System.out.println("�̸�");	// �̸��� �Է¹޾�, ����Ʈ���� �� �̸��� �ִ� ��ġ�� ã�� ��ȯ
		String name = scanner.next(); // �� ����� �˻��� �ƴ϶� ����, ���������� ����, ������ ��������
		for( int i = 0; i<data.size(); i++) { // ��ġ�� ã�ƾ��ϹǷ� ���
			if(name.equals(data.get(i).getName())) { // case 2: ���� search()�� �˻��� ��ġ�� ���޹޾�(22)����
				return i; // 23���ٿ��� get()���� �� ��ġ�� �ִ� ���� ������ ���
			}
		}
		return 0;
	}
	public void editMember(ArrayList<Member> data) { // ������ ó���ϴ� �޼����
		int idx = search(data); // ���� search()�� ȣ���� ������ �������� ��ġ�� ã�´�.
		System.out.println("�� ��ȭ��ȣ"); // �׸��� �� �����͸� �Է¹޾�
		String tel = scanner.next(); // set()���� �� ��ġ�� ��ü�� �� Member��ü�� ��ü.
		scanner.nextLine();
		System.out.println("�� �ּ�");
		String address = scanner.nextLine();
		data.set(idx, new Member(data.get(idx).getName(), tel, address));
	}
	public void delMember(ArrayList<Member> data) { // ���� �޼���� search()�� ȣ���� 
		int idx = search(data); // ������ �������� ��ġ�� ã��
		data.remove(idx); // remove()�� �����͸� �����Ѵ�.
	} 
	public void printMember(Member m) { // Member��ü �ϳ��� �Ķ���ͷ� �޾� ó���Ѵ�.
		System.out.println(m);
	}
}

