package ch11_inheritance;

public class ParentMain {

	public static void main(String[] args) {
		Parent p = new Parent(); // ��ü�� �����Ǹ� �ٷ� �����ڰ� ȣ��Ǿ� �޼����� ���
		p.name = "�θ�"; 
		p.age = 50;
		p.setMoney(1000000);
		p.printParentInfo();
		System.out.println("money : "+p.getMoney());
		System.out.println("---------------");
		
		Child c = new Child(); // Child ��ü�� �����Ǹ鼭 Parent������, Child������ ȣ��. �θ�κ��� �Ļ�
		c.name = "�ڽ�"; 
		c.age = 200; 
		c.setHobby("��Ÿ");
		c.printParentInfo();
		c.printInfo();
	}
}
